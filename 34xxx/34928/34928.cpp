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

int paul[4];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; string s; cin >> n >> s;
    if(n%2) return !(cout << "NO");

    memset(paul, -1, sizeof paul);
    for(int i=0;i<n;i++) {
        if(s[i]=='P' && i%2==0) paul[0]=i;
        else if(s[i]=='A' && paul[0]!=-1 && (i-paul[0])%2) paul[1]=i;
        else if(s[i]=='U' && paul[1]!=-1 && (i-paul[1])%2) paul[2]=i;
        else if(s[i]=='L' && paul[2]!=-1 && (i-paul[2])%2) return !(cout << "YES");
    }
    cout << "NO";
}