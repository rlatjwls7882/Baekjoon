#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> arr[i][j];
        }
    }

    long long visit[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            visit[i][j]=0;
        }
    }
    visit[0][0]=1;

    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(visit[i][j] && arr[i][j]) {
                if(i+arr[i][j]<N) visit[i+arr[i][j]][j] += visit[i][j];
                if(j+arr[i][j]<N) visit[i][j+arr[i][j]] += visit[i][j];
            }
        }
    }
    cout << visit[N-1][N-1];
}