#include<bits/stdc++.h>
using namespace std;

long long preSum[2][500'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<2;i++) {
        for(int j=1;j<=n;j++) {
            cin >> preSum[i][j];
            preSum[i][j] += preSum[i][j-1];
        }
    }

    long long A = max(min(preSum[0][n], preSum[0][n/2+1]+preSum[1][n/2+1]), preSum[0][n/2]+preSum[1][n/2]);
    cout << A << ' ' << preSum[0][n]+preSum[1][n]-A;
}