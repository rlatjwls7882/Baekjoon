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

    int cnt[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cnt[i][j]=1000000000;
        }
    }

    cnt[0][0]=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            for(int k=1;k<=arr[i][j];k++) {
                if(i+k<N) cnt[i+k][j] = min(cnt[i+k][j], cnt[i][j]+1);
                if(j+k<M) cnt[i][j+k] = min(cnt[i][j+k], cnt[i][j]+1);
            }
        }
    }
    cout << cnt[N-1][M-1];
}