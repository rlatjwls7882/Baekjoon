#include<bits/stdc++.h>
using namespace std;

int s[1000], h[1000], dp[101]; // dp[i] : 체력이 i일때의 최대 점수

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    for(int i=0;i<n;i++) cin >> s[i];
    for(int i=0;i<n;i++) cin >> h[i];

    for(int i=0;i<n;i++) {
        for(int j=0;j+h[i]<=100;j++) { // 곡 선택
            dp[j] = max(dp[j], dp[j+h[i]]+s[i]);
        }
        for(int j=100+k;j-k>=0;j--) { // 체력회복
            dp[min(100, j)] = max(dp[min(100, j)], dp[j-k]);
        }
    }
    cout << *max_element(dp, dp+101);
}