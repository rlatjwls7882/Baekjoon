#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    int a[N];
    for(int i=0;i<N;i++) {
        cin >> a[i];
    }

    int maxEnergy=INT_MIN;
    int dp[N];
    dp[0] = a[0];
    for(int i=1;i<N;i++) {
        maxEnergy = max(maxEnergy,a[i]-K*i-dp[i-1]);
        dp[i] = min(dp[i-1], a[i]-K*i);
    }

    for(int i=0;i<N/2;i++) swap(a[i], a[N-1-i]);
    dp[0] = a[0];
    for(int i=1;i<N;i++) {
        maxEnergy = max(maxEnergy,a[i]-K*i-dp[i-1]);
        dp[i] = min(dp[i-1], a[i]-K*i);
    }
    cout << maxEnergy;
}