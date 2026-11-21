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
    
    int _max=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(arr[i][j]==0) {
                int cur=INT_MAX;
                for(int a=0;a<N;a++) {
                    for(int b=0;b<M;b++) {
                        if(arr[a][b]==1) {
                            cur = min(cur, max(abs(i-a), abs(j-b)));
                        }
                    }
                }
                _max = max(_max, cur);
            }
        }
    }
    cout << _max;
}