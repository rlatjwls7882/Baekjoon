#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1000000007;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int A[N], B[N];
    for(int i=0;i<N;i++) {
        cin >> A[i] >> B[i];
    }

    long long dp[2] = {1, 0};
    for(int i=0;i<N;i++) {
        if(B[i]==0) {
            dp[1] = (dp[1]+dp[0]*(M-1))%MOD;
        } else {
            dp[1] = (dp[1]*(M-1)+dp[0])%MOD;
            dp[0] = (dp[0]*(M-1))%MOD;
        }
    }
    cout << (dp[0]+dp[1])%MOD;
}