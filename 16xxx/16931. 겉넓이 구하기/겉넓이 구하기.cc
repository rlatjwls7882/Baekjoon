#include<bits/stdc++.h>
using namespace std;

int moveX[2] = {1, 0};
int moveY[2] = {0, 1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int arr[N+2][M+2];
    for(int i=0;i<N+2;i++) {
        for(int j=0;j<M+2;j++) {
            if(i==0 || i==N+1 || j==0 || j==M+1) {
                arr[i][j]=0;
            } else {
                cin >> arr[i][j];
            }
        }
    }

    int sum = N*M*2;
    for(int i=0;i<=N;i++) {
        for(int j=0;j<=M;j++) {
            for(int k=0;k<2;k++) {
                sum += abs(arr[i][j]-arr[i+moveX[k]][j+moveY[k]]);
            }
        }
    }
    cout << sum;
}