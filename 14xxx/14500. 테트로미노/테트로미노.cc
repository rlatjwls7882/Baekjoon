#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int arr[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> arr[i][j];
        }
    }

    int maxSum=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(i+3<N) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j]);
            if(j+3<M) maxSum = max(maxSum, arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3]);

            if(i+1<N && j+1<M) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1]);

            if(i+2<N && j+1<M) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j+1]);
            if(i+1<N && j+2<M) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i][j+2]);
            if(i+2<N && j+1<M) maxSum = max(maxSum, arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1]);
            if(i+1<N && j-2>=0) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i+1][j-1]+arr[i+1][j-2]);
            if(i+2<N && j-1>=0) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j-1]);
            if(i+1<N && j+2<M) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]);
            if(i+2<N && j-1>=0) maxSum = max(maxSum, arr[i][j]+arr[i][j-1]+arr[i+1][j-1]+arr[i+2][j-1]);
            if(i+1<N && j+2<M) maxSum = max(maxSum, arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2]);

            if(i+2<N && j+1<M) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j+1]);
            if(i-1>=0 && j+2<M) maxSum = max(maxSum, arr[i][j]+arr[i][j+1]+arr[i-1][j+1]+arr[i-1][j+2]);
            if(i+2<N && j-1>=0) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i+1][j-1]+arr[i+2][j-1]);
            if(i+1<N && j+2<M) maxSum = max(maxSum, arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2]);

            if(i+1<N && j+2<M) maxSum = max(maxSum, arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i][j+2]);
            if(0<=i-1 && i+1<N && j+1<M) maxSum = max(maxSum, arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i-1][j+1]);
            if(i+2<N && j+1<M) maxSum = max(maxSum, arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j]);
            if(i-1>=0 && j+2<M) maxSum = max(maxSum, arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i-1][j+1]);
        }
    }
    cout << maxSum;
}