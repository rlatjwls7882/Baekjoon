#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    ll A[n][n];
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> A[i][j];
        }
    }

    ll plus[n+1][n+1];
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            plus[i][j]=0;
        }
    }

    while(m-->0) {
        int cnt, i1, j1, i2, j2; cin >> cnt >> i1 >> j1 >> i2 >> j2;
        if(cnt==1) {
            int k; cin >> k;
            plus[i1][j1]+=k;
            plus[i1][j2+1]-=k;
            plus[i2+1][j1]-=k;
            plus[i2+1][j2+1]+=k;
        } else {
            for(int i=0;i<n;i++) {
                for(int j=0;j<n-1;j++) {
                    plus[i][j+1] += plus[i][j];
                }
            }
            for(int i=0;i<n-1;i++) {
                for(int j=0;j<n;j++) {
                    plus[i+1][j] += plus[i][j];
                }
            }

            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    A[i][j] += plus[i][j];
                }
            }
            ll preSum[n+1][n+1];
            for(int i=0;i<=n;i++) {
                preSum[i][0]=0;
                preSum[0][i]=0;
            }
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=n;j++) {
                    preSum[i][j] = A[i-1][j-1]+preSum[i-1][j]+preSum[i][j-1]-preSum[i-1][j-1];
                }
            }
            cout << preSum[i2+1][j2+1]-preSum[i1][j2+1]-preSum[i2+1][j1]+preSum[i1][j1];
        }
    }
}