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
    int r; string s; cin >> r >> s;
    if(s.find('1')!=s.npos && r>1900) return !(cout << 1);
    if(s.find('2')!=s.npos && 1601<=r && r<=1900) return !(cout << 2);
    if(s.find('3')!=s.npos && r<=1600) return !(cout << 3);
    for(char ch:s) {
        if(ch=='1') cout << "1\n";
        else if(ch=='2') {
            cout << "2";
            if(r>1900) cout << '*';
            cout << '\n';
        } else {
            cout << "3";
            if(r>1600) cout << '*';
            cout << '\n';
        }
    }
}