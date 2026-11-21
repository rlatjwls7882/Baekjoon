#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

int w, u, d, l, r, a, v, s, e;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    while(n--) {
        string ss; cin >> ss;
        for(char c:ss) {
            if(c=='#') w++;
            if(c=='U') u++;
            if(c=='D') d++;
            if(c=='L') l++;
            if(c=='R') r++;
            if(c=='A') a++;
            if(c=='V') v++;
            if(c=='S') s++;
            if(c=='E') e++;
        }
    }
    if(s==1 && e==1) {
        if(!a && !v) {
            if(w<=1 && u+d+l+r<=1) return !(cout << 1);
            return !(cout << 2);
        }
        if(!a) return !(cout << 3);
        return !(cout << 4);
    }
    cout << -1;
}