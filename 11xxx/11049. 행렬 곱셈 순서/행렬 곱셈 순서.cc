#include<bits/stdc++.h>
using namespace std;

const int INF = 1000000000;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int r[N], c[N];
    for(int i=0;i<N;i++) cin >> r[i] >> c[i];

    int dp[N][N]; fill(&dp[0][0], &dp[N-1][N], INF);
    for(int i=0;i<N;i++) dp[i][i]=0; // length=1

    // length>1
    for(int length=2;length<=N;length++) {
        for(int start=0;start+length-1<N;start++) {
            int end = start+length-1;
            for(int mid=start;mid<end;mid++) {
                dp[start][end] = min(dp[start][end], dp[start][mid] + dp[mid+1][end] + r[start]*c[mid]*c[end]);
            }
        }
    }
    cout << dp[0][N-1];
}