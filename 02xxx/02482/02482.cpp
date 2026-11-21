#include<bits/stdc++.h>
using namespace std;

// dp[i][j][k] : i번 색을 마지막으로 선택하고, 총 j개를 선택했을때의 경우의 수, k는 첫번째 색을 포함했는지 여부.
const long long MOD = 1e9+3;
long long dp[1000][1001][2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, K; cin >> N >> K;

    dp[0][1][1]=1;
    for(int i=1;i<N;i++) {
        dp[i][1][0]=1; // i번째 색을 처음으로 선택함.
        for(int j=0;j<i-1;j++) {
            for(int k=0;k<K;k++) {
                for(int l=0;l<2;l++) {
                    dp[i][k+1][l] = (dp[i][k+1][l] + dp[j][k][l]) % MOD; // j번을 마지막으로 선택하고 총 선택 수가 k개인 것에서 추가로 i번을 더 선택함.
                }
            }
        }
    }

    long long total=0;
    for(int i=0;i<N-1;i++) {
        total += dp[i][K][0]+dp[i][K][1];
    }
    total = (total + dp[N-1][K][0]) % MOD; // 마지막 색을 선택하면 처음 색을 선택하면 안됨.

    cout << total;
}