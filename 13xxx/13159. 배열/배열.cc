#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;

struct Splay {
    struct node {
        node *l=0, *r=0, *p=0;
        ll val=0, sum=0, mn=0, mx=0, lazyA=0, lazyD=0, setLazy=0;
        int cnt=1;
        bool flip=0, set=0;
    };
    node *root;
    vector<node*> stk = vector<node*>(300'001);
    vector<node*> pos = vector<node*>(300'001);

    node *newNode(ll val) {
        node *x = new node;
        x->val=x->sum=x->mn=x->mx=val;
        pos[val]=x;
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
        x->sum=x->mn=x->mx=x->val;
        if(x->l) {
            x->cnt+=x->l->cnt;
            x->sum+=x->l->sum;
            x->mn=min(x->mn, x->l->mn);
            x->mx=max(x->mx, x->l->mx);
        }
        if(x->r) {
            x->cnt+=x->r->cnt;
            x->sum+=x->r->sum;
            x->mn=min(x->mn, x->r->mn);
            x->mx=max(x->mx, x->r->mx);
        }
    }

    void applyAD(node *x, ll a, ll d) {
        if(!x) return;
        ll left=x->l ? x->l->cnt : 0;
        x->val+=a+left*d;
        x->mn+=a+left*d;
        x->mx+=a+left*d;
        x->sum+=(2*a+(x->cnt-1)*d)*x->cnt/2;
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
        x->sum=x->mn=x->mx=x->cnt*v;
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

    ll minRange(int s, int e) {
        node *x=gather(s, e);
        return x->mn;
    }

    ll maxRange(int s, int e) {
        node *x=gather(s, e);
        return x->mx;
    }

    void shiftRight(int s, int e, int x) {
        int len=e-s+1;
        x%=len;
        if(x<0) x+=len;
        if(x==0) return;
        flipRange(s, e-x);
        flipRange(e-x+1, e);
        flipRange(s, e);
    }

    int getPos(int p) {
        node *x=pos[p];
        splay(x);
        return x->l ? x->l->cnt : 0;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;
    Splay splay;
    for(int i=1;i<=n;i++) splay.insert(i, i);
    while(q--) {
        int op, l, r, i, x; cin >> op;
        if(op==1) {
            cin >> l >> r;
            auto e = splay.gather(l, r);
            cout << e->mn << ' ' << e->mx << ' ' << e->sum << '\n';
            splay.flipRange(l, r);
        } else if(op==2) {
            cin >> l >> r >> x;
            auto e = splay.gather(l, r);
            cout << e->mn << ' ' << e->mx << ' ' << e->sum << '\n';
            splay.shiftRight(l, r, x);
        } else if(op==3) {
            cin >> i;
            cout << splay.get(i) << '\n';
        } else {
            cin >> x;
            cout << splay.getPos(x) << '\n';
        }
    }
    for(int i=1;i<=n;i++) cout << splay.get(i) << ' ';
}