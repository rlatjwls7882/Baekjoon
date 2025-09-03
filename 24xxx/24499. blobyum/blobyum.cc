#include<bits/stdc++.h>
using namespace std;

int preSum[200'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    for(int i=1;i<=n;i++) {
        cin >> preSum[i];
        preSum[i+n] = preSum[i];
    }
    for(int i=1;i<=2*n;i++) preSum[i] += preSum[i-1];

    int maxSum=0;
    for(int i=k;i<=2*n;i++) maxSum = max(maxSum, preSum[i]-preSum[i-k]);
    cout << maxSum;
}