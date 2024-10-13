#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int A[n+1];
        for(int i=1;i<=n;i++) cin >> A[i];
        sort(A+1, A+n+1);

        long long preSum[n+1] = {0, };
        for(int i=1;i<=n;i++) preSum[i] = A[i]+preSum[i-1];

        long long sum=0;
        for(int i=2;i<=n;i++) {
            long long minVal = LONG_LONG_MAX;
            for(int j=i;j<=n;j++) minVal = min(minVal, A[j]*i-(preSum[j]-preSum[j-i]));
            sum += minVal;
        }
        cout << sum << '\n';
    }
}