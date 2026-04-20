#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;

struct Splay {
    struct node {
        node *l=0, *r=0, *p=0;
        ll val=0, sum=0, lazyA=0, lazyD=0, setLazy=0;
        int cnt=1;
        bool flip=0, set=0;
    };
    node *root;

    node *newNode(ll val) {
        node *x = new node;
        x->val=val;
        x->sum=val;
        return x;
    }

    Splay() {
        root = new node;
        root->r = new node;
        root->r->p=root;
        update(root);
    }

    void clear(node *x) {
        if(!x) return;
        clear(x->l);
        clear(x->r);
        delete x;
    }

    ~Splay() {
        clear(root);
    }

    int size() {
        return root->cnt-2;
    }

    void update(node *x) {
        if(!x) return;
        x->cnt=1;
        x->sum=x->val;
        if(x->l) {
            x->cnt+=x->l->cnt;
            x->sum+=x->l->sum;
        }
        if(x->r) {
            x->cnt+=x->r->cnt;
            x->sum+=x->r->sum;
        }
    }

    ll op(ll n, ll a, ll d) {
        return a*n+n*(n-1)/2*d;
    }

    void applyAD(node *x, ll a, ll d) {
        if(!x) return;
        ll left=x->l ? x->l->cnt : 0;
        x->val+=a+left*d;
        x->sum+=op(x->cnt, a, d);
        x->lazyA+=a;
        x->lazyD+=d;
    }

    void applyFlip(node *x) {
        if(!x) return;
        swap(x->l, x->r);
        x->flip^=1;
    }

    void applySet(node *x, ll v) {
        if(!x) return;
        x->val=v;
        x->sum=x->cnt*v;
        x->lazyA=x->lazyD=0;
        x->setLazy=v;
        x->set=1;
    }

    void push(node *x) {
        if(!x) return;
        if(x->flip) {
            applyFlip(x->l);
            applyFlip(x->r);
            x->flip=0;
        }
        if(x->set) {
            applySet(x->l, x->setLazy);
            applySet(x->r, x->setLazy);
            x->set=0;
        }
        if(x->lazyA || x->lazyD) {
            int L = x->l ? x->l->cnt : 0;
            applyAD(x->l, x->lazyA, x->lazyD);
            applyAD(x->r, x->lazyA+(L+1)*x->lazyD, x->lazyD);
            x->lazyA=x->lazyD=0;
        }
    }

    void rotate(node *x) {
        node *p=x->p;
        if(!p) return;
        push(p); push(x);
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
        vector<node*> stk;
        for(node *y=x;y!=g;y=y->p) stk.push_back(y);
        if(g) stk.push_back(g);
        for(int i=stk.size()-1;i>=0;i--) push(stk[i]);

        while(x->p!=g) {
            node *p=x->p, *pp=p->p;
            if(pp==g) rotate(x);
            else if((x==p->l)==(p==pp->l)) rotate(p), rotate(x);
            else rotate(x), rotate(x);
        }
        if(!g) root=x;
    }

    node* kth(int k) {
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

    void setRange(int s, int e, ll val) {
        node *x=gather(s, e);
        applySet(x, val);
        update(root->r);
        update(root);
    }

    void addRange(int s, int e, ll val) {
        node *x=gather(s, e);
        applyAD(x, val, 0);
        update(root->r);
        update(root);
    }

    void addRangeAD(int s, int e, ll a, ll d) {
        node *x=gather(s, e);
        applyAD(x, a, d);
        update(root->r);
        update(root);
    }

    void flipRange(int s, int e) {
        node *x=gather(s, e);
        applyFlip(x);
        update(root->r);
        update(root);
    }

    ll get(int pos) {
        node *x=gather(pos, pos);
        push(x);
        return x->val;
    }

    ll sumRange(int s, int e) {
        node *x=gather(s, e);
        return x->sum;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;
    Splay sp;
    for(int i=1;i<=n;i++) {
        ll a; cin >> a;
        sp.insert(i, a);
    }

    while(q--) {
        int op, a, b, c; cin >> op >> a >> b;
        if(op==1) {
            cin >> c;
            sp.setRange(a, b, c);
        } else if(op==2) {
            cin >> c;
            sp.addRangeAD(a, b, c, c);
        } else if(op==3) {
            sp.insert(a, b);
        } else {
            cout << sp.sumRange(a, b) << '\n';
        }
    }
}