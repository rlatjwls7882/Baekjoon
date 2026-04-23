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

struct EERTREE {
    struct Node {
        int len=0, link=0, occ=0, pos=-1;
        array<int, 26> next{};
    };
    vector<Node> tree;
    string s="$";
    int last=1;
    EERTREE() {
        tree = {{-1}, {0}};
        tree[0].link = tree[1].link = 0;
    }
    int count() { return tree.size()-2; }
    string get(int v) { return s.substr(tree[v].pos-tree[v].len+1, tree[v].len); }

    int getLink(int v) {
        int i = s.size()-1;
        while(s[i-1-tree[v].len]!=s[i]) v = tree[v].link;
        return v;
    }

    int add(char ch) {
        s+=ch;
        int c = ch-'a';
        int cur = getLink(last);

        if(!tree[cur].next[c]) {
            int now = tree.size();
            tree.push_back({tree[cur].len+2});
            tree[now].pos = s.size()-1;
            tree[now].link = (tree[now].len==1 ? 1 : tree[getLink(tree[cur].link)].next[c]);
            tree[cur].next[c] = now;
        }
        last = tree[cur].next[c];
        tree[last].occ++;
        return last;
    }
    void add(string& str) { for(char c:str) add(c); }
    void build() { for(int i=tree.size()-1;i>=2;i--) tree[tree[i].link].occ+=tree[i].occ; }
};
struct Hashing {
    const ll P = 917, M = 998244353;
    vll h, p;
    Hashing(const string &s) : h(sz(s)+1), p(sz(s)+1) {
        int n=sz(s);
        p[0]=1;
        for(int i=1;i<=n;i++) h[i]=(h[i-1]*P+s[i-1])%M;
        for(int i=1;i<=n;i++) p[i]=p[i-1]*P%M;
    }
    ll get(int s, int e) {
        return ((h[e]-h[s-1]*p[e-s+1])%M+M)%M;
    }
};
map<pair<ll, int>, int> cnt;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        EERTREE eertree;
        Hashing h(s);
        eertree.add(s);
        for(int i=eertree.tree.size()-1;i>1;i--) {
            int len = eertree.tree[i].len;
            int e = eertree.tree[i].pos;
            int s = e-len+1;
            cnt[{h.get(s, e), len}]++;
        }
    }

    int res=0;
    for(auto e:cnt) {
        if(e.y==n) res=max(res, e.x.y);
    }
    cout << res;
}