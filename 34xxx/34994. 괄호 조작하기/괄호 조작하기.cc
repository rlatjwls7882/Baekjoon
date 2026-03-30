#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
#include <ext/rope>
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

string s;
char c[] = {'(', ')', '{', '}', '[', ']'};

bool solve() {
    vector<char> v;
    for(auto e:s) {
        v.push_back(e);
        while(v.size()>=2 && (v[sz(v)-2]=='[' && v.back()==']' || v[sz(v)-2]=='{' && v.back()=='}' || v[sz(v)-2]=='(' && v.back()==')')) v.pop_back(), v.pop_back();
    }
    return v.empty();
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        cin >> s;
        string res="NO\n";
        for(int i=0;i<sz(s);i++) {
            char rem=s[i];
            for(int j=0;j<6;j++) {
                s[i]=c[j];
                if(solve()) {
                    res="YES 1\n"+to_string(i+1)+" "+c[j]+"\n";
                    i=sz(s);
                    break;
                }
            }
            s[i]=rem;
        }
        cout << res;
    }
}