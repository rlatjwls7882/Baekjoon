#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    int preSum[N+1][N+1];
    for(int i=0;i<=N;i++) {
        preSum[i][0]=0;
        preSum[0][i]=0;
    }

    for(int i=1;i<=N;i++) {
        for(int j=1;j<=N;j++) {
            preSum[i][j] = preSum[i-1][j]+preSum[i][j-1]-preSum[i-1][j-1];
            if(m[i-1][j-1]=='1') preSum[i][j]++;
        }
    }

    int cnt=0;
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=N;j++) {
            if(m[i-1][j-1]=='1') {
                for(int k=1;;k++) {
                    if(i-k<1 || i+k>N || j-k<1 || j+k>N || preSum[i+k][j+k]-preSum[i+k][j-k-1]-preSum[i-k-1][j+k]+preSum[i-k-1][j-k-1]!=1+4*k) break;
                    if(!(preSum[i-1][j-1]-preSum[i-1][j-k-1]-preSum[i-k-1][j-1]+preSum[i-k-1][j-k-1]) && !(preSum[i+k][j-1]-preSum[i+k][j-k-1]-preSum[i][j-1]+preSum[i][j-k-1]) && !(preSum[i-1][j+k]-preSum[i-1][j]-preSum[i-k-1][j+k]+preSum[i-k-1][j]) && !(preSum[i+k][j+k]-preSum[i+k][j]-preSum[i][j+k]+preSum[i][j])) {
                        cnt++;
                    } else {
                        break;
                    }
                }
            }
        }
    }
    cout << cnt;
}