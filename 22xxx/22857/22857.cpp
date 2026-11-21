#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int maxLen=0;
    int dp[K+1] = {0, };
    for(int i=0;i<N;i++) {
        if(arr[i]%2==1) {
            for(int i=K;i>0;i--) {
                dp[i] = dp[i-1];
            }
            dp[0]=0;
        } else {
            for(int i=0;i<=K;i++) {
                maxLen = max(maxLen, ++dp[i]);
            }
        }
    }
    cout << maxLen;
}