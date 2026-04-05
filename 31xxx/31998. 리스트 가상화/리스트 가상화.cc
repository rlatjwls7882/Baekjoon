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
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<ll> vll;
typedef vector<vll> vvll;
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

int sz=700;
vector<deque<ll>> bucket(sz+2);

void insert(ll i, ll h) {
    for(int j=0;j<sz;j++) {
        if(i<sz(bucket[j])) {
            bucket[j].insert(bucket[j].begin()+i, h);
            if(i) bucket[j][i]+=bucket[j][i-1];
            for(int k=i+1;k<sz(bucket[j]);k++) bucket[j][k]+=h;
            if(sz(bucket[j])>sz) {
                int cnt=sz(bucket[j])/2;
                ll rem = bucket[j][sz(bucket[j])-cnt-1];
                ll add = bucket[j].back()-rem;

                for(int k=0;k<cnt;k++) {
                    bucket[j+1].push_front(bucket[j].back()-rem);
                    bucket[j].pop_back();
                }
                for(int k=cnt;k<sz(bucket[j+1]);k++) bucket[j+1][k]+=add;
            }
            break;
        } else if(i==0) {
            for(auto &e:bucket[j]) e+=h;
            bucket[j].push_front(h);
            break;
        }
        i-=sz(bucket[j]);
    }
}

void del(ll i) {
    for(int j=0;j<sz;j++) {
        if(i<sz(bucket[j])) {
            ll rem = bucket[j][i];
            if(i) rem-=bucket[j][i-1];
            bucket[j].erase(bucket[j].begin()+i);
            for(int k=i;k<sz(bucket[j]);k++) bucket[j][k]-=rem;
            break;
        }
        i-=sz(bucket[j]);
    }
}

int query(ll t, ll b) {
    ll ret=0, i=0;
    while(i<sz) {
        if(bucket[i].empty()) {
            i++;
            continue;
        }
        if(bucket[i].back()>t) break;
        t-=bucket[i].back();
        b-=bucket[i].back();
        i++;
    }
    ret += lower_bound(all(bucket[i]), b)-upper_bound(all(bucket[i]), t)+1;
    if(lower_bound(all(bucket[i]), b)==bucket[i].end()) ret--;
    if(sz(bucket[i])) b-=bucket[i].back();
    i++;

    while(i<sz) {
        if(bucket[i].empty()) {
            i++;
            continue;
        }
        if(bucket[i].back()>b) break;
        ret+=sz(bucket[i]);
        b-=bucket[i].back();
        i++;
    }
    int idx = lower_bound(all(bucket[i]), b)-bucket[i].begin();
    if(idx<sz(bucket[i]) && b>0) ret+=idx+1;
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;
    for(int i=0;i<n;i++) {
        ll a; cin >> a;
        if(sz(bucket[i/sz])) a+=bucket[i/sz].back();
        bucket[i/sz].push_back(a);
    }

    while(q--) {
        ll op, i, h, t, b; cin >> op;
        if(op==1) {
            cin >> i >> h;
            insert(i-1, h);
        } else if(op==2) {
            cin >> i;
            del(i-1);
        } else {
            cin >> t >> b;
            cout << query(t, b) << '\n';
        }
    }
}