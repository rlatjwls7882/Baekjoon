#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; string s; cin >> N >> s >> K;

    int Rcnt=0, Ucnt=0, Xcnt=0;
    for(int i=0;i<N;i++) {
        if(s[i]=='R') Rcnt++;
        else if(s[i]=='U') Ucnt++;
        else Xcnt++;
    }

    int cnt=0;
    while(K-->0) {
        int x, y; cin >> x >> y; x--; y--;
        int moveCross = min(min(x, y), Xcnt);
        x -= moveCross;
        y -= moveCross;
        if(x<=Rcnt && y<=Ucnt) cnt++;
    }
    cout << cnt;
}