#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string s[N];
    for(int i=0;i<N;i++) {
        cin >> s[i];
    }

    int maxSize=1;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            for(int len=1;;len++) {
                if(i+len>=N || j+len>=M) break;
                if(s[i][j]==s[i+len][j] && s[i][j]==s[i][j+len] && s[i][j]==s[i+len][j+len]) maxSize = max(maxSize, (len+1)*(len+1));
            }
        }
    }
    cout << maxSize;
}