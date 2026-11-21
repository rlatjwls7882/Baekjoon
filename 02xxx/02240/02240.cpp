#include <bits/stdc++.h>
using namespace std;

int pos[1000];
int cnt[1000][31];

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t, w; cin >> t >> w;

    int maxCnt=0;
    for(int i=0;i<t;i++) {
        cin >> pos[i];
        if(pos[i]==1) cnt[i][0]=1;
        else cnt[i][1]=1;

        for(int j=i-1;j>=0;j--) {
            for(int k=0;k<=w;k++) {
                if(cnt[j][k]) {
                    if(pos[i]==pos[j]) cnt[i][k] = max(cnt[i][k], cnt[j][k]+1);
                    else if(k<w) cnt[i][k+1] = max(cnt[i][k+1], cnt[j][k]+1);
                }
            }
        }
        for(int j=0;j<=w;j++) maxCnt = max(maxCnt, cnt[i][j]);
    }
    cout << maxCnt;
}