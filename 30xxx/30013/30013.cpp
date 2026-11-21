#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; string s; cin >> N >> s;

    int minCnt = N;
    for(int d=1;d<N;d++) {
        int curCnt=0;
        for(int i=0;i<N;i++) {
            if(s[i]=='#' && (i-d<0 || s[i-d]=='.')) curCnt++;
        }
        minCnt = min(minCnt, curCnt);
    }
    cout << minCnt;
}