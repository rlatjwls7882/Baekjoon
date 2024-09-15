#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, M, K; cin >> N >> M >> K;

    ll D[N];
    for(int i=0;i<N;i++) {
        cin >> D[i];
    }
    sort(D, D+N, greater<ll>());


    ll P[K+1];
    int Q[K+1];
    for(int i=1;i<=K;i++) {
        cin >> P[i] >> Q[i];
    }

    int sum=0;
    int dp[K+1][901];
    for(int i=0;i<M;i++) {
        for(int j=0;j<=900;j++) {
            dp[0][j]=0;
        }
        for(int j=0;j<=K;j++) {
            dp[j][0]=0;
        }
        for(int j=1;j<=K;j++) {
            ll T = (P[j]+D[i]-1)/D[i];
            for(int k=0;k<=900;k++) {
                dp[j][k]=dp[j-1][k];
                if(k-T>=0) {
                    dp[j][k] = max(dp[j][k], dp[j-1][k-T]+Q[j]);
                }
            }
        }
        sum += dp[K][900];
    }
    cout << sum;
}