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
    ll n, a, b; cin >> n >> a >> b;
    string s; cin.ignore(); getline(cin, s);
    a%=26;
    int off=1;
    while(b--) off=off*a%26;

    for(char ch:s) {
        if(ch==' ') cout << ' ';
        else cout << char((ch-'A'-off+26)%26+'A');
    }
}