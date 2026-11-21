#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;

const ll LINF = 0x3f3f3f3f3f3f3f3f;

struct Splay {
    struct node {
        node *l=0, *r=0, *p=0;
        ll val=0, sum=0, pref=-LINF, suff=-LINF, best=-LINF;
        int cnt=1;
        bool flip=0;
        ~node() {
            if(l) delete l;
            if(r) delete r;
        }
    };
    node *root;
    vector<node*> stk;
    Splay(int MAX) : stk(MAX+2) {
        root = new node;
        root->r = new node;
        root->r->p=root;
        update(root);
    }
    ~Splay() { delete root; }

    node *newNode(ll val) {
        node *x = new node;
        x->sum=x->val=x->pref=x->suff=x->best=val;
        return x;
    }

    void update(node *x) {
        if(!x) return;
        x->cnt=1;
        x->sum=x->suff=x->pref=x->best=x->val;
        if(x->l) {
            x->best=max({x->best, x->l->best, x->l->suff+x->pref});
            x->pref=max(x->l->sum+x->pref, x->l->pref);
            x->suff=max(x->suff, x->sum+x->l->suff);
            x->cnt+=x->l->cnt;
            x->sum+=x->l->sum;
        }
        if(x->r) {
            x->best=max({x->best, x->r->best, x->r->pref+x->suff});
            x->pref=max(x->pref, x->sum+x->r->pref);
            x->suff=max(x->r->sum+x->suff, x->r->suff);
            x->cnt+=x->r->cnt;
            x->sum+=x->r->sum;
        }
    }

    void applyFlip(node *x) {
        if(!x) return;
        swap(x->l, x->r);
        swap(x->pref, x->suff);
        x->flip^=1;
    }

    void push(node *x) {
        if(!x || !x->flip) return;
        applyFlip(x->l);
        applyFlip(x->r);
        x->flip=0;
    }

    void rotate(node *x) {
        node *p=x->p;
        if(!p) return;
        if(x==p->l) {
            p->l=x->r;
            if(x->r) x->r->p=p;
            x->r=p;
        } else {
            p->r=x->l;
            if(x->l) x->l->p=p;
            x->l=p;
        }
        x->p=p->p;
        p->p=x;
        (x->p ? x->p->l==p ? x->p->l : x->p->r : root) = x;
        update(p); update(x);
    }

    void splay(node *x, node *g=0) {
        int top=0;
        for(node *y=x;y!=g;y=y->p) stk[top++]=y;
        if(g) stk[top++]=g;
        while(top) push(stk[--top]);

        while(x->p!=g) {
            node *p=x->p, *pp=p->p;
            if(pp==g) rotate(x);
            else if((x==p->l)==(p==pp->l)) rotate(p), rotate(x);
            else rotate(x), rotate(x);
        }
        if(!g) root=x;
    }

    node *kth(int k) {
        node *x=root;
        while(true) {
            push(x);
            int lCnt=x->l ? x->l->cnt : 0;
            if(k<lCnt) x=x->l;
            else if(k==lCnt) break;
            else k-=lCnt+1, x=x->r;
        }
        splay(x);
        return x;
    }

    node *gather(int s, int e) {
        node *R=kth(e+1);
        node *L=kth(s-1);
        splay(R, L);
        return root->r->l;
    }

    void insert(int pos, ll val) {
        node *L=kth(pos-1);
        node *R=kth(pos);
        splay(L);
        splay(R, L);
        node *x = newNode(val);
        R->l=x;
        x->p=R;
        update(R); update(L);
    }

    void erase(int pos) {
        node *x=gather(pos, pos);
        root->r->l=0;
        delete x;
        update(root->r);
        update(root);
    }

    void flipRange(int s, int e) {
        node *x=gather(s, e);
        applyFlip(x);
        update(root->r);
        update(root);
    }

    ll maxBest(int s, int e) {
        node *x=gather(s, e);
        return x->best;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    Splay splay(n);
    for(int i=1;i<=n;i++) {
        int a; cin >> a;
        splay.insert(i, a ? a : -100'000);
    }

    int m; cin >> m;
    while(m--) {
        int op, l, r; cin >> op >> l >> r;
        if(op==1) splay.flipRange(l, r);
        else cout << max(0LL, splay.maxBest(l, r)) << '\n';
    }
}