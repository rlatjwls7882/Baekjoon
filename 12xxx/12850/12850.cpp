#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1e9+7;

long long conn[8][8] = {
    {0, 1, 1, 0, 0, 0, 0, 0},
    {1, 0, 1, 1, 0, 0, 0, 0},
    {1, 1, 0, 1, 1, 0, 0, 0},
    {0, 1, 1, 0, 1, 1, 0, 0},
    {0, 0, 1, 1, 0, 1, 1, 0},
    {0, 0, 0, 1, 1, 0, 0, 1},
    {0, 0, 0, 0, 1, 0, 0, 1},
    {0, 0, 0, 0, 0, 1, 1, 0},
};

long long dp[8][8] = { // dp[i][j] : i에서 j로 가는 경우의 수
    {1, 0, 0, 0, 0, 0, 0, 0},
    {0, 1, 0, 0, 0, 0, 0, 0},
    {0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 1, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0},
    {0, 0, 0, 0, 0, 1, 0, 0},
    {0, 0, 0, 0, 0, 0, 1, 0},
    {0, 0, 0, 0, 0, 0, 0, 1},
};

void matrix_square() {
    long long nextConn[8][8] = {0, };
    for(int i=0;i<8;i++) {
        for(int j=0;j<8;j++) {
            for(int k=0;k<8;k++) {
                nextConn[i][j] += conn[i][k] * conn[k][j];
            }
            nextConn[i][j] %= MOD;
        }
    }
    memcpy(conn, nextConn, sizeof conn);
}

void matrix_mult() {
    long long nextDp[8][8] = {0, };
    for(int i=0;i<8;i++) {
        for(int j=0;j<8;j++) {
            for(int k=0;k<8;k++) {
                nextDp[i][j] += dp[i][k] * conn[k][j];
            }
            nextDp[i][j] %= MOD;
        }
    }
    memcpy(dp, nextDp, sizeof dp);
}

void expo_pow(long long n) {
    if(n==0) return;
    if(n%2) matrix_mult();
    matrix_square();
    expo_pow(n>>1);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n; cin >> n;
    expo_pow(n);
    cout << dp[0][0];
}