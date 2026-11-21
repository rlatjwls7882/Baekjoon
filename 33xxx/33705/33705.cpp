#include<bits/stdc++.h>
using namespace std;

int preSum[200001][2]; // [][1번투표, 나머지투표]

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        int A; cin >> A;
        preSum[i][0] = preSum[i-1][0];
        preSum[i][1] = preSum[i-1][1];
        if(A==1) preSum[i][0]++;
        else preSum[i][1]++;
    }
    
    if(preSum[n][0]>=preSum[n][1]) {
        cout << 0;
        return 0;
    }
    
    for(int i=1;i<n;i++) {
        if(preSum[i][0]>=preSum[i][1] || preSum[n][0]-preSum[i][0]>=preSum[n][1]-preSum[i][1]) {
            cout << 1;
            return 0;
        }
    }
    cout << 2;
}