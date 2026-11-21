#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int score1=0, score2=0;
    for(int i=1;i<=3;i++) {
        int cnt; cin >> cnt;
        score1 += cnt*i;
    }
    for(int i=1;i<=3;i++) {
        int cnt; cin >> cnt;
        score2 += cnt*i;
    }

    if(score1>score2) cout << 1;
    else if(score1<score2) cout << 2;
    else cout << 0;
}