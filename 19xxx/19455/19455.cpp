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

const int MAX = 2'000'000;
const int FULL = (1<<30)-1;
int SZ=1, lazyAnd[MAX], lazyOr[MAX];

struct node {
    int mn, zero, one;
} arr[MAX];


node merge(node &a, node &b) {
    return {min(a.mn, b.mn), a.zero&b.zero, a.one&b.one};
}

void propagate(int i) {
    if(!arr[i].one && !arr[i].zero) return;
    arr[i].mn&=~lazyAnd[i];
    arr[i].zero|=lazyAnd[i];
    arr[i].one&=~lazyAnd[i];

    arr[i].mn|=lazyOr[i];
    arr[i].zero&=~lazyOr[i];
    arr[i].one|=lazyOr[i];

    if(i<SZ) {
        for(int j:{i*2, i*2+1}) {
            lazyAnd[j]=(lazyAnd[j]&~lazyOr[i])|lazyAnd[i];
            lazyOr[j]=(lazyOr[j]&~lazyAnd[i])|lazyOr[i];
        }
    }
    lazyAnd[i]=lazyOr[i]=0;
}

void AND(int L, int R, int x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum);
    if(nodeR<L || R<nodeL) return;
    x&=~arr[nodeNum].zero;
    if(L<=nodeL && nodeR<=R && (x&arr[nodeNum].one)) {
        lazyAnd[nodeNum]=x&arr[nodeNum].one;
        x&=~arr[nodeNum].one;
        propagate(nodeNum);
    }
    if(!x) return;
    int mid=nodeL+nodeR>>1;
    AND(L, R, x, nodeNum*2, nodeL, mid);
    AND(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

void OR(int L, int R, int x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum);
    if(nodeR<L || R<nodeL) return;
    x&=~arr[nodeNum].one;
    if(L<=nodeL && nodeR<=R && (x&arr[nodeNum].zero)) {
        lazyOr[nodeNum]=x&arr[nodeNum].zero;
        x&=~arr[nodeNum].zero;
        propagate(nodeNum);
    }
    if(!x) return;
    int mid=nodeL+nodeR>>1;
    OR(L, R, x, nodeNum*2, nodeL, mid);
    OR(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

int query(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum);
    if(nodeR<L || R<nodeL) return FULL;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].mn;
    int m=nodeL+nodeR>>1;
    return min(query(L, R, nodeNum*2, nodeL, m), query(L, R, nodeNum*2+1, m+1, nodeR));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<SZ+n;i++) {
        int a; cin >> a;
        arr[i] = {a, a^FULL, a};
    }
    for(int i=SZ+n;i<2*SZ;i++) arr[i]={FULL, FULL, 0};
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    int m; cin >> m;
    while(m--) {
        char op; int l, r, x; cin >> op >> l >> r;
        if(op=='&') {
            cin >> x;
            AND(l-1, r-1, x^FULL);
        } else if(op=='|') {
            cin >> x;
            OR(l-1, r-1, x);
        } else {
            cout << query(l-1, r-1) << '\n';
        }
    }
}