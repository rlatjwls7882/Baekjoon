#include<bits/stdc++.h>
using namespace std;

int V[101][100001];
int dp[101][100001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    for(int i=1;i<=M;i++) for(int j=1;j<=N;j++) cin >> V[i][j];
    for(int i=1;i<=M;i++) dp[i][1] = V[i][1];

    for(int i=2;i<=N;i++) {
        for(int cur=1;cur<=M;cur++) {
            for(int last=1;last<=M;last++) {
                if(cur==last) dp[cur][i] = max(dp[cur][i], dp[last][i-1]+V[cur][i]/2);
                else dp[cur][i] = max(dp[cur][i], dp[last][i-1]+V[cur][i]);
            }
        }
    }

    int maxVal=0;
    for(int i=1;i<=M;i++) maxVal = max(maxVal, dp[i][N]);
    cout << maxVal;
}