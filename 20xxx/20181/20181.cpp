#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    long long dp[N] = {0, }, cnt=0, sum=0;
    for(int i=0;i<N;i++) {
        if(i>=1) dp[i]=dp[i-1];
        sum += arr[i];
        cnt++;

        if(sum>=K) {
            if(i-cnt>=0) dp[i] = max(dp[i], dp[i-cnt]+sum-K);
            else dp[i] = max(dp[i], sum-K);
        }
        while(sum>=K) sum -= arr[i+1-cnt--];
    }
    cout << dp[N-1];
}