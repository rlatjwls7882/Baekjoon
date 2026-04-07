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
template<typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template<typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

vector<int> bucketIdx;
vector<unordered_set<int>> cnt(100'001), contest(100'001);
ll sz, peopleAcc[100'001], contestAcc[100'001];

struct Q {
    int op, i, j, x;
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m, q; cin >> n >> m >> q;
    sz = sqrt(q);

    vector<Q> query(q);
    for(int i=0;i<q;i++) {
        cin >> query[i].op;
        if(query[i].op==1) {
            cin >> query[i].j >> query[i].i;
            cnt[query[i].j].insert(query[i].i);
        }
        else if(query[i].op==2) cin >> query[i].j >> query[i].x;
        else cin >> query[i].i;
    }
    for(int j=1;j<=m;j++) if(sz(cnt[j])>sz) bucketIdx.push_back(j);

    for(auto cur:query) {
        int i=cur.i, j=cur.j, x=cur.x;
        if(cur.op==1) {
            if(contest[j].count(i)) contest[j].erase(i), peopleAcc[i]+=contestAcc[j];
            else contest[j].insert(i), peopleAcc[i]-=contestAcc[j];
        } else if(cur.op==2) {
            if(sz(cnt[j])>sz) contestAcc[j]+=x;
            else for(auto i:contest[j]) peopleAcc[i]+=x;
        } else {
            ll res=peopleAcc[i];
            for(int j:bucketIdx) if(contest[j].count(i)) res+=contestAcc[j];
            cout << res << '\n';
        }
    }
}