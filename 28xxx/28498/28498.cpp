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

int SZ=1;
const int MAX = 2'000'000;

struct node {
    ll mx1, mx2, mxCnt, mn1, mn2, mnCnt, sum, lazy;
} arr[MAX];

node merge(node &a, node &b) {
    node ret = {max(a.mx1, b.mx1), max(a.mx2, b.mx2), a.mxCnt+b.mxCnt, min(a.mn1, b.mn1), min(a.mn2, b.mn2), a.mnCnt+b.mnCnt, a.sum+b.sum, 0};
    if(a.mx1>b.mx1) ret.mx2=max(a.mx2, b.mx1), ret.mxCnt=a.mxCnt;
    else if(a.mx1<b.mx1) ret.mx2=max(a.mx1, b.mx2), ret.mxCnt=b.mxCnt;
    if(a.mn1<b.mn1) ret.mn2=min(a.mn2, b.mn1), ret.mnCnt=a.mnCnt;
    else if(a.mn1>b.mn1) ret.mn2=min(a.mn1, b.mn2), ret.mnCnt=b.mnCnt;
    return ret;
}

void applyAdd(int i, ll x, int len) {
    arr[i].mn1+=x;
    if(arr[i].mn2!=LINF) arr[i].mn2+=x;
    arr[i].mx1+=x;
    if(arr[i].mx2!=-LINF) arr[i].mx2+=x;
    arr[i].sum+=len*x;
    arr[i].lazy+=x;
}

void applyMin(int i, ll x) {
    if(arr[i].mx1<=x) return;
    arr[i].sum-=(arr[i].mx1-x)*arr[i].mxCnt;
    if(arr[i].mx1==arr[i].mn1) arr[i].mn1=x;
    else if(arr[i].mx1==arr[i].mn2) arr[i].mn2=x;
    arr[i].mx1=x;
}

void applyMax(int i, ll x) {
    if(arr[i].mn1>=x) return;
    arr[i].sum-=(arr[i].mn1-x)*arr[i].mnCnt;
    if(arr[i].mn1==arr[i].mx1) arr[i].mx1=x;
    else if(arr[i].mn1==arr[i].mx2) arr[i].mx2=x;
    arr[i].mn1=x;
}

void propagate(int i, int l, int r) {
    if(i>=SZ) return;
    if(arr[i].lazy) {
        int mid=l+r>>1;
        applyAdd(i*2, arr[i].lazy, mid-l+1);
        applyAdd(i*2+1, arr[i].lazy, r-mid);
        arr[i].lazy=0;
    }
    for(int j:{i*2, i*2+1}) {
        if(arr[j].mx1>arr[i].mx1) applyMin(j, arr[i].mx1);
        if(arr[j].mn1<arr[i].mn1) applyMax(j, arr[i].mn1);
    }
}

void add(int L, int R, ll x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return;
    if(L<=nodeL && nodeR<=R) {
        applyAdd(nodeNum, x, nodeR-nodeL+1);
        return;
    }
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    add(L, R, x, nodeNum*2, nodeL, mid);
    add(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

void setMin(int L, int R, ll x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL || arr[nodeNum].mx1<=x) return;
    if(L<=nodeL && nodeR<=R && arr[nodeNum].mx2<x) {
        applyMin(nodeNum, x);
        return;
    }
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    setMin(L, R, x, nodeNum*2, nodeL, mid);
    setMin(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

void setMax(int L, int R, ll x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL || arr[nodeNum].mn1>=x) return;
    if(L<=nodeL && nodeR<=R && arr[nodeNum].mn2>x) {
        applyMax(nodeNum, x);
        return;
    }
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    setMax(L, R, x, nodeNum*2, nodeL, mid);
    setMax(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

ll minQuery(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return LINF;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].mn1;
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    return min(minQuery(L, R, nodeNum*2, nodeL, mid), minQuery(L, R, nodeNum*2+1, mid+1, nodeR));
}

struct element {
    int l, r, idx;
    bool operator<(const element e) const {
        return r<e.r;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m, q; cin >> n >> m >> q;
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<2*SZ;i++) arr[i] = {-1, -LINF, 1, -1, LINF, 1, 0, 0};
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    vector<element> v(m);
    for(int i=0;i<m;i++) cin >> v[i].l >> v[i].r;
    sort(all(v));

    vector<element> queries(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i].l >> queries[i].r;
        queries[i].idx=i;
    }
    sort(all(queries));

    int idx=0;
    vector<string> res(q);
    for(auto [l, r, i]:queries) {
        while(idx<m && v[idx].r<=r) setMax(v[idx].l-1, v[idx].r-1, v[idx].l-1), idx++;
        res[i] = minQuery(l-1, r-1)>=l-1 ? "YES" : "NO";
    }
    for(auto e:res) cout << e << '\n';
}