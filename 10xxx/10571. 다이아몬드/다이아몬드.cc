#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        double w[N], c[N];
        for(int i=0;i<N;i++) {
            cin >> w[i] >> c[i];
        }

        int maxLen=1;
        int dp[N];
        for(int i=0;i<N;i++) {
            dp[i]=1;
            for(int j=i-1;j>=0;j--) {
                if(w[j]<w[i] && c[j]>c[i]) {
                    dp[i] = max(dp[i], dp[j]+1);
                }
            }
            maxLen = max(maxLen, dp[i]);
        }
        cout << maxLen << '\n';
    }
}