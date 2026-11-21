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

const int MAX = 800'000;

struct node {
    int mx, mn;
} arr[MAX];

int SZ=1, lazy1[MAX], lazy2[MAX];

node merge(node a, node b) {
    return {max(a.mx, b.mx), min(a.mn, b.mn)};
}

void propagate(int nodeNum, int nodeL, int nodeR) {
    if(!lazy1[nodeNum] && lazy2[nodeNum]==INF) return;
    if(lazy2[nodeNum]==INF) {
        arr[nodeNum].mx+=lazy1[nodeNum];
        arr[nodeNum].mn+=lazy1[nodeNum];
        if(nodeL^nodeR) {
            lazy1[nodeNum*2]+=lazy1[nodeNum];
            lazy1[nodeNum*2+1]+=lazy1[nodeNum];
        }
    } else {
        arr[nodeNum].mx=arr[nodeNum].mn=lazy1[nodeNum]+lazy2[nodeNum];
        if(nodeL^nodeR) {
            lazy1[nodeNum*2]=lazy1[nodeNum];
            lazy1[nodeNum*2+1]=lazy1[nodeNum];
            lazy2[nodeNum*2]=lazy2[nodeNum];
            lazy2[nodeNum*2+1]=lazy2[nodeNum];
        }
    }
    lazy1[nodeNum]=0; lazy2[nodeNum]=INF;
}

void add(int L, int R, int x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum, nodeL, nodeR);
    if(nodeR<L || R<nodeL) return;
    if(L<=nodeL && nodeR<=R) {
        lazy1[nodeNum]=x;
        propagate(nodeNum, nodeL, nodeR);
        return;
    }
    int mid=nodeL+nodeR>>1;
    add(L, R, x, nodeNum*2, nodeL, mid);
    add(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

void div(int L, int R, int x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum, nodeL, nodeR);
    if(nodeR<L || R<nodeL) return;
    if(L<=nodeL && nodeR<=R) {
        int a = arr[nodeNum].mx/x;
        int b = arr[nodeNum].mn/x;
        if(a==b) {
            lazy2[nodeNum]=a;
            propagate(nodeNum, nodeL, nodeR);
            return;
        }
        if(arr[nodeNum].mn+1==arr[nodeNum].mx) {
            lazy1[nodeNum]=a-arr[nodeNum].mx;
            propagate(nodeNum, nodeL, nodeR);
            return;
        }
    }
    int mid=nodeL+nodeR>>1;
    div(L, R, x, nodeNum*2, nodeL, mid);
    div(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

int query(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum, nodeL, nodeR);
    if(nodeR<L || R<nodeL) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].mx;
    int mid=nodeL+nodeR>>1;
    return max(query(L, R, nodeNum*2, nodeL, mid), query(L, R, nodeNum*2+1, mid+1, nodeR));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;
    while(SZ<n) SZ<<=1;
    fill(lazy2, lazy2+SZ*2, INF);
    for(int i=SZ;i<SZ+n;i++) {
        int a; cin >> a;
        arr[i]={a, a};
    }
    for(int i=SZ+n;i<SZ*2;i++) arr[i]={-INF, INF};
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    while(q--) {
        int t, l, r, x; cin >> t >> l >> r >> x;
        if(t==0) add(l, r, x);
        else if(t==1) div(l, r, x);
        else cout << query(l, r) << '\n';
    }
}