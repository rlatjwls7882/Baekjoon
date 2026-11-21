#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }

    int maxSize=1;
    int dp[n] = {1, };
    for(int i=1;i<n;i++) {
        dp[i]=1;
        for(int j=i-1;j>=0;j--) {
            if(arr[j]<arr[i]) {
                dp[i] = max(dp[i], dp[j]+1);
            }
        }
        maxSize = max(maxSize, dp[i]);
    }
    cout << maxSize;
}