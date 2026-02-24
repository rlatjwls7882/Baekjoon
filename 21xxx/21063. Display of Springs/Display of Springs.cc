#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define f first
#define s second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

struct LiChao {
    struct Line {
        int i=0;
    };
    bool ask(int a, int b, int x) {
        if(a==b) return true;
        cout << "? " << a << ' ' << b << ' ' << x << '\n' << flush;
        string s; cin >> s;
        return s=="FIRST" || s=="EQUAL";
    }
    struct Node {
        int s, e, line=0;
        int l=-1, r=-1;
    };
    vector<Node> arr;
    LiChao(int s, int e) {
        arr.push_back({s, e});
    }

    void update(int l, int nodeNum=0) {
        int s=arr[nodeNum].s, e=arr[nodeNum].e;
        int m = s+e>>1;
        int low = arr[nodeNum].line, high = l;
        if(ask(low, high, m)) swap(low, high);
        arr[nodeNum].line=high;
        if(s==e) return;

        if(ask(low, high, e)) {
            if(arr[nodeNum].r==-1) {
                arr[nodeNum].r=arr.size();
                arr.push_back({m+1, e});
            }
            update(low, arr[nodeNum].r);
        } else {
            if(arr[nodeNum].l==-1) {
                arr[nodeNum].l=arr.size();
                arr.push_back({s, m});
            }
            update(low, arr[nodeNum].l);
        }
    }

    int query(int x, int nodeNum=0) {
        int s=arr[nodeNum].s, e=arr[nodeNum].e;
        int m = s+e>>1;
        if(x<=m) {
            if(arr[nodeNum].l!=-1) {
                int ret = query(x, arr[nodeNum].l);
                if(ask(arr[nodeNum].line, ret, x)) return arr[nodeNum].line;
                return ret;
            }
            return arr[nodeNum].line;
        }
        if(arr[nodeNum].r!=-1) {
            int ret = query(x, arr[nodeNum].r);
            if(ask(arr[nodeNum].line, ret, x)) return arr[nodeNum].line;
            return ret;
        }
        return arr[nodeNum].line;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    LiChao lichao(1, 1e5);
    for(int i=1;i<n;i++) lichao.update({i});

    cout << "!\n" << flush;
    while(true) {
        string s; int w; cin >> s >> w;
        if(s=="FINISH") break;
        int res = lichao.query(w);
        cout << "! " << res << '\n' << flush;
    }
}