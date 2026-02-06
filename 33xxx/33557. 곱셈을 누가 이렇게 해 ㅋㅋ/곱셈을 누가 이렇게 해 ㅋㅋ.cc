#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        string a, b; cin >> a >> b;
        if(a.length()<b.length()) swap(a, b);
        ll res1 = stoll(a)*stoll(b);

        string res2="";
        for(int i=0;i<a.length();i++) {
            if(i>=a.length()-b.length()) {
                string s = to_string((a[i]-'0')*(b[i-(a.length()-b.length())]-'0'));
                res2+=s[0];
                if(s.length()==2) res2+=s[1];
            }
            else res2+=a[i];
        }
        cout << (res1==stoll(res2)) << '\n';
    }
}