#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    if(n==1) return !(cout << 1906);
    if(n==3) return !(cout << 2026);
    if(n==5) return !(cout << 12106);
    if(n==7) return !(cout << 1003906);
    string s="1";
    for(int i=0;i<n/2-1;i++) s+="0";
    s+="2";
    for(int i=0;i<n/2-1;i++) s+="0";
    s+="6";
    s[n-3]='9';
    s[n-4]='1';
    cout << s;
}