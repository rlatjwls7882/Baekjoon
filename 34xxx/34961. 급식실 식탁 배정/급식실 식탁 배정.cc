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

int sz=1, arr[800'001];

void update(int x, int val) {
    x+=sz-1;
    arr[x]+=val;
    while(x>1) {
        x>>=1;
        arr[x]=arr[x*2]+arr[x*2+1];
    }
}

int query(int x) {
    int idx=1;
    while(idx<sz) {
        idx<<=1;
        if(x>arr[idx]) x-=arr[idx++];
    }
    if(x>arr[idx]) return -1;
    return idx-sz+1;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int q; cin >> q;
    while(sz<200'000) sz<<=1;
    while(q--) {
        int a, b; cin >> a >> b;
        if(a==1) update(b, 1);
        else update(b, -1);

        int cnt=0, last=0, rem=0;
        for(int i=1;i<=500;i++) {
            if(arr[sz+i-1]>rem) {
                int cur = (arr[sz+i-1]-rem+i-1)/i;
                cnt+=cur;
                rem+=cur*i-arr[sz+i-1];
            } else {
                rem-=arr[sz+i-1];
            }
            last+=arr[sz+i-1];
        }
        last+=rem;
        while(true) {
            int f = query(last+1);
            if(f==-1) break;
            cnt++;
            last+=f;
        }
        cout << cnt << '\n';
    }
}