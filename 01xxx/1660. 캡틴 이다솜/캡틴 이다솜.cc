#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    vector<int> require;
    require.push_back(1);
    for(int i=2;require.back()+i*(i+1)/2<=300000;i++) {
        require.push_back(require.back()+i*(i+1)/2);
    }

    int N; cin >> N;
    int dp[N+1]; fill(dp, dp+N+1, 1000000);
    dp[0]=0;
    for(int i=0;i<require.size();i++) {
        for(int j=require[i];j<=N;j++) {
            dp[j] = min(dp[j], dp[j-require[i]]+1);
        }
    }
    cout << dp[N];
}