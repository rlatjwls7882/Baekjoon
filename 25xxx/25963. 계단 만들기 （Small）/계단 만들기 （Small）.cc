#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
int a[100], dp[100][10001][101];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int sum=0;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        sum += a[i];
    }

    fill(&dp[0][0][0], &dp[99][10000][101], INF);
    for(int i=1;i<=100;i++) dp[0][i][i] = abs(a[0]-i);
    for(int i=1;i<n;i++) {
        for(int j=1;j<=sum;j++) {
            for(int k=1;k<=100;k++) {
                for(int l=-1;l<=1;l++) {
                    if(j-k>=0 && 0<=k+l && k+l<=100) dp[i][j][k] = min(dp[i][j][k], abs(a[i]-k) + dp[i-1][j-k][k+l]);
                }
            }
        }
    }
    cout << *min_element(&dp[n-1][sum][0], &dp[n-1][sum][101])/2;
}