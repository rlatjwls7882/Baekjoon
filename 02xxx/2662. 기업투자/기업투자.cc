#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;

    // 투자비용
    int profit[n][m];
    for(int i=0;i<n;i++) {
        cin >> profit[i][0];
        for(int j=0;j<m;j++) {
            cin >> profit[i][j];
        }
    }

    // 냅색으로 최대이익 계산
    int maxProfit[n+1] = {0, };
    int cnt[n+1][m]; fill(&cnt[0][0], &cnt[n][m], 0);
    for(int i=0;i<m;i++) {
        for(int j=n;j>=1;j--) {
            for(int k=0;k<j;k++) {
                if(maxProfit[j] < maxProfit[k]+profit[j-k-1][i]) {
                    maxProfit[j] = maxProfit[k]+profit[j-k-1][i];
                    for(int l=0;l<m;l++) cnt[j][l] = cnt[k][l];
                    cnt[j][i] += j-k;
                }
            }
        }
    }
    cout << maxProfit[n] << '\n';
    for(int i=0;i<m;i++) cout << cnt[n][i] << ' ';
}