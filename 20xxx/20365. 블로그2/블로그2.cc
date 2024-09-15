#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string s; cin >> s;

    int cntB=0, cntR=0;
    if(s[0]=='B') cntB++;
    else cntR++;
    for(int i=1;i<N;i++) {
        if(s[i-1]=='B' && s[i]=='R') cntR++;
        if(s[i-1]=='R' && s[i]=='B') cntB++;
    }
    cout << min(cntR, cntB)+1;
}