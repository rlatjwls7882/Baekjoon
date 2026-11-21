#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n, k; cin >> n >> k;
        if(!n) break;

        int s=2, b=k-1;
        while(n-->0) {
            int h; string SorB; cin >> h >> SorB;
            if(SorB[0]=='S') s = max(s, h+1);
            else b = min(b, h-1);
        }
        cout << s << ' ' << b << '\n';
    }
}