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
        string s; cin >> s;
        vector<bool> vis(s.length());
        for(int i=0;i<s.length();i++) {
            if(s[i]=='B') {
                if(i-1>=0) vis[i-1]=true;
                if(i-2>=0) vis[i-2]=true;
            } else if(s[i]=='S') {
                if(i-1>=0) vis[i-1]=true;
                if(i+1<s.length()) vis[i+1]=true;
            }
        }

        int res=0;
        for(int i=0;i<s.length();i++) res+= s[i]=='-' && !vis[i];
        cout << res << ' ';
    }
}