#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, Q; cin >> N >> M >> Q;
    int A[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> A[i][j];
        }
    }

    int dp[N][M];
    dp[0][0]=A[0][0];
    for(int i=1;i<N;i++) {
        dp[i][0]=A[i][0]+dp[i-1][0];
    }
    for(int i=0;i<M;i++) {
        dp[0][i]=A[0][i];
    }

    for(int i=1;i<N;i++) {
        for(int j=1;j<M;j++) {
            dp[i][j] = dp[i-1][j-1]+dp[i-1][j]+A[i][j];
            if(i>=2) dp[i][j] -= dp[i-2][j-1];
        }
    }

    while(Q-->0) {
        int W, P; cin >> W >> P;
        cout << dp[W-1][P-1] << '\n';
    }
}