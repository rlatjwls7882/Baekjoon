#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;
    int block[K][4];
    for(int i=0;i<K;i++) {
        for(int j=0;j<4;j++) {
            cin >> block[i][j];
        }
        if(block[i][0]>block[i][2] || block[i][1]>block[i][3]) {
            swap(block[i][0], block[i][2]);
            swap(block[i][1], block[i][3]);
        }
    }

    long long dp[N+1][M+1];
    for(int i=0;i<=N;i++) {
        for(int j=0;j<=M;j++) {
            if(i==0 && j==0) dp[i][j]=1;
            else dp[i][j]=0;
            bool right=true, up=true;
            for(int k=0;k<K;k++) {
                if(block[k][0]==i && block[k][1]==j-1 && block[k][2]==i && block[k][3]==j) right=false;
                if(block[k][0]==i-1 && block[k][1]==j && block[k][2]==i && block[k][3]==j) up=false;
            }
            if(i>=1 && up) dp[i][j] += dp[i-1][j];
            if(j>=1 && right) dp[i][j] += dp[i][j-1];
        }
    }
    cout << dp[N][M];
}