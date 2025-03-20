#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> v(n); // 초기에 세워진 줄
    for(int i=0;i<n;i++) cin >> v[i];

    int maxCnt=0; // 이미 적절하게 줄서있는 사람들의 수
    vector<int> dp(n); // i까지의 가장 긴 증가하는 부분수열의 길이
    for(int i=0;i<n;i++) {
        dp[i]=1;
        for(int j=0;j<i;j++) {
            if(v[j] < v[i]) {
                dp[i] = max(dp[i], dp[j]+1);
            }
        }
        maxCnt = max(maxCnt, dp[i]);
    }
    cout << n-maxCnt;
}