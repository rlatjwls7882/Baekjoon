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
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

unordered_set<string> s2;

struct Trie {
    vector<pair<int, Trie*>> go;
    bool finish=false;
    void add(const string& s) {
        Trie* cur=this;
        for(char ch:s) {
            Trie* next=0;
            for(auto e:cur->go) {
                if(e.first==ch) {
                    next=e.y;
                    break;
                }
            }
            if(!next) {
                next = new Trie;
                cur->go.push_back({ch, next});
            }
            cur = next;
        }
        cur->finish=true;
    }
    bool find(const string& s) {
        Trie* cur=this;
        for(int i=0;i<sz(s);i++) {
            if(cur->finish && s2.count(s.substr(i))) return true;
            char ch=s[i];
            Trie* next=0;
            for(auto e:cur->go) {
                if(e.first==ch) {
                    next=e.y;
                    break;
                }
            }
            if(!next) return false;
            cur = next;
        }
        return false;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int c, n; cin >> c >> n;
    Trie trie;
    for(int i=0;i<c;i++) {
        string s; cin >> s;
        trie.add(s);
    }
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        s2.insert(s);
    }

    int q; cin >> q;
    for(int i=0;i<q;i++) {
        string s; cin >> s;
        cout << (trie.find(s) ? "Yes\n" : "No\n");
    }
}