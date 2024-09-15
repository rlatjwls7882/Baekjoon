#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int L, R, S; cin >> L >> R >> S;

        int cnt = 200000000;
        if(S>R) cnt = min(cnt, (S-R)*2+1);
        else cnt = min(cnt, (R-S)*2);

        if(S>L) cnt = min(cnt, (S-L)*2+1);
        else cnt = min(cnt, (L-S)*2);
        cout << cnt << '\n';
    }
}