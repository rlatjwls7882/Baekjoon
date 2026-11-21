#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; string s; cin >> N >> s;

    int minCnt=INT_MAX;

    // B 옮기기
    int cnt=0, idx=0;
    while(idx<N && s[idx]=='B') idx++;
    while(idx<N) {
        if(s[idx++]=='B') cnt++;
    }
    minCnt = min(minCnt, cnt);

    cnt=0, idx=N-1;
    while(idx>=0 && s[idx]=='B') idx--;
    while(idx>=0) {
        if(s[idx--]=='B') cnt++;
    }
    minCnt = min(minCnt, cnt);

    // R 옮기기
    cnt=0, idx=0;
    while(idx<N && s[idx]=='R') idx++;
    while(idx<N) {
        if(s[idx++]=='R') cnt++;
    }
    minCnt = min(minCnt, cnt);

    cnt=0, idx=N-1;
    while(idx>=0 && s[idx]=='R') idx--;
    while(idx>=0) {
        if(s[idx--]=='R') cnt++;
    }
    minCnt = min(minCnt, cnt);

    cout << minCnt;
}