#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int coinList[3] = {2, 5, 7};

    int dp[N+1];
    for(int i=0;i<=N;i++) {
        dp[i]=i;
    }

    for(int i=0;i<3;i++) {
        for(int j=coinList[i];j<=N;j++) {
            dp[j] = min(dp[j], dp[j-coinList[i]]+1);
        }
    }
    cout << dp[N];
}