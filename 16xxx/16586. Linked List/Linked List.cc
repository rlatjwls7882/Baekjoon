#include<bits/stdc++.h>
#include<ext/pb_ds/assoc_container.hpp>
#include<ext/pb_ds/tree_policy.hpp>
#include<ext/rope>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;
using namespace __gnu_pbds;
using namespace __gnu_cxx;

#define x first
#define y second
#define sz(x) (int)(x).size()
#define all(x) x.begin(), x.end()
#define rep(x) for(int __i=(x);__i>0;--__i)
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef __int128 i128;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<ll> vll;
typedef vector<vll> vvll;
template<typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template<typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

struct Splay {
    struct node {
        node *l=0, *r=0, *p=0;
        ll val=0;
        int cnt=1;
        bool flip=0;
    };
    node *root;
    vector<node*> stk, pos;

    node *newNode(ll val) {
        node *x = new node;
        x->val=val;
        pos[val]=x;
        return x;
    }

    Splay(int MAX) : stk(MAX+2), pos(MAX+2) {
        root = new node;
        root->r = new node;
        root->r->p=root;
        update(root);
    }

    void update(node *x) {
        if(!x) return;
        x->cnt=1;
        if(x->l) x->cnt+=x->l->cnt;
        if(x->r) x->cnt+=x->r->cnt;
    }

    void applyFlip(node *x) {
        if(!x) return;
        swap(x->l, x->r);
        x->flip^=1;
    }

    void push(node *x) {
        if(!x) return;
        if(x->flip) {
            applyFlip(x->l);
            applyFlip(x->r);
            x->flip=0;
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

    ll getPos(int v) {
        node *x=pos[v];
        splay(x);
        return x->l ? x->l->cnt : 0;
    }

    ll query(int a, int b) {
        int u = getPos(a);
        int v = getPos(b);
        if(u<v) {
            flipRange(u, v);
            flipRange(u, v-1);
            return v-u;
        } else {
            flipRange(v+1, u);
            flipRange(v+2, u);
            return v-u+1;
        }
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;
    Splay splay(n);
    for(int i=1;i<=n;i++) splay.insert(i, i);

    while(q--) {
        int a, b; cin >> a >> b;
        cout << splay.query(a, b) << '\n';
    }
    for(int i=1;i<=n;i++) cout << splay.get(i) << ' ';
}