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

string s[3];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    for(int i=0;i<3;i++) cin >> s[i];
    if(s[0][0]==s[0][1] && s[0][1]==s[0][2]) {
        if(s[0][0]=='X') return !(cout << 'X');
        if(s[0][0]=='O') return !(cout << 'O');
    }
    if(s[1][0]==s[1][1] && s[1][1]==s[1][2]) {
        if(s[1][0]=='X') return !(cout << 'X');
        if(s[1][0]=='O') return !(cout << 'O');
    }
    if(s[2][0]==s[2][1] && s[2][1]==s[2][2]) {
        if(s[2][0]=='X') return !(cout << 'X');
        if(s[2][0]=='O') return !(cout << 'O');
    }
    if(s[0][0]==s[1][0] && s[1][0]==s[2][0]) {
        if(s[0][0]=='X') return !(cout << 'X');
        if(s[0][0]=='O') return !(cout << 'O');
    }
    if(s[0][1]==s[1][1] && s[1][1]==s[2][1]) {
        if(s[0][1]=='X') return !(cout << 'X');
        if(s[0][1]=='O') return !(cout << 'O');
    }
    if(s[0][2]==s[1][2] && s[1][2]==s[2][2]) {
        if(s[0][2]=='X') return !(cout << 'X');
        if(s[0][2]=='O') return !(cout << 'O');
    }
    if(s[0][0]==s[1][1] && s[1][1]==s[2][2]) {
        if(s[0][0]=='X') return !(cout << 'X');
        if(s[0][0]=='O') return !(cout << 'O');
    }
    if(s[0][2]==s[1][1] && s[1][1]==s[2][0]) {
        if(s[0][2]=='X') return !(cout << 'X');
        if(s[0][2]=='O') return !(cout << 'O');
    }
    cout << "N";
}