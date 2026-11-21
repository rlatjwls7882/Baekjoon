#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;
    
    long arr[N+1][N+1];
    for(int i=0;i<=N;i++) {
        fill(arr[i], arr[i]+N+1, 0);
    }

    arr[N][N]=1;
    for(int i=N;i>0;i--) {
        for(int j=N;j>0;j--) {
            arr[i-1][j] = (arr[i-1][j]+arr[i][j])%1000000007;
            arr[i][j-1] = (arr[i][j-1]+arr[i][j])%1000000007;
        }
    }

    int sum=0;
    for(int i=1;i<=N;i++) {
        sum = (sum+arr[i][0]+arr[0][i])%1000000007;
    }
    cout << sum << " " << N*N;
}