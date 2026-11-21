#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    
    int _max=0;
    int dp[n+1][2];
    dp[0][0]=dp[0][1]=0;
    for(int i=1;i<=n;i++) { // 0: 1개 연속 선택, 1: 2개 연속 선택 
        int tmp; cin >> tmp;
        dp[i][0]=tmp;
        for(int j=i-2;j>=0;j--) {
            dp[i][0] = max(dp[i][0], tmp+max(dp[j][0], dp[j][1]));
        }

        if(i-1>=0 && dp[i-1][0]!=0) {
            dp[i][1]=tmp+dp[i-1][0];
        } else {
            dp[i][1]=0;
        }
        _max = max(_max, max(dp[i][0], dp[i][1]));
    }
    cout << _max;
}