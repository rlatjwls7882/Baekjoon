#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    long long preSum[n+1];
    preSum[0]=0;
    for(int i=1;i<=n;i++) {
        cin >> preSum[i];
        preSum[i] += preSum[i-1];
    }

    int minK, minDiff=INT_MAX;
    for(int k=1;k<=n/2;k++) {
        for(int i=0;i+k<=n;i++) {
            for(int j=i+k;j+k<=n;j++) {
                long long diff = abs(preSum[i+k]-preSum[i] - (preSum[j+k]-preSum[j]));
                if(diff<=minDiff) {
                    minK=k;
                    minDiff=diff;
                }
            }
        }
    }
    cout << minK << '\n' << minDiff;
}