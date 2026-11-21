#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, M; cin >> N >> M;

    long arr[N][M];
    for(int i=0;i<N;i++) {
        arr[i][0]=1;
    }
    for(int i=0;i<M;i++) {
        arr[0][i]=1;
    }

    for(int i=1;i<N;i++) {
        for(int j=1;j<M;j++) {
            arr[i][j] = (arr[i-1][j]+arr[i][j-1]+arr[i-1][j-1])%1000000007;
        }
    }
    cout << arr[N-1][M-1];
}