#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int n, k, t, m; cin >> n >> k >> t >> m;

        int cnt[n] = {0, };
        int score[n][k];
        for(int i=0;i<n;i++) {
            for(int j=0;j<k;j++) {
                score[i][j]=0;
            }
        }
        int time[n] = {0, };

        for(int a=0;a<m;a++) {
            int i, j, s; cin >> i >> j >> s;
            cnt[i-1]++;
            score[i-1][j-1]=max(s, score[i-1][j-1]);
            time[i-1]=a;
        }

        int scoreSum[n] = {0, };
        for(int i=0;i<n;i++) {
            for(int j=0;j<k;j++) {
                scoreSum[i] += score[i][j];
            }
        }

        int rank=1;
        for(int i=0;i<n;i++) {
            if(scoreSum[i]>scoreSum[t-1] || scoreSum[i]==scoreSum[t-1]&&cnt[i]<cnt[t-1] || scoreSum[i]==scoreSum[t-1]&&cnt[i]==cnt[t-1]&&time[i]<time[t-1]) {
                rank++;
            }
        }
        cout << rank << '\n';
    }
}