#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    long long dp[N];
    for(int i=0;i<N;i++) {
        dp[i]=1;
        for(int j=i-1;j>=0;j--) {
            if(arr[j]<arr[i]) {
                dp[i] += dp[j];
            }
        }
        dp[i] %= 998244353;
        cout << dp[i] << ' ';
    }
}