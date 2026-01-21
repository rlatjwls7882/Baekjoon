#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

string chk(string s) {
    for(int i=0;i<s.length()-1;i++) {
        if(s[i]==s[i+1]) return "No\n";
    }
    return "Yes\n";
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        string s; cin >> s;
        cout << chk(s);
    }
}