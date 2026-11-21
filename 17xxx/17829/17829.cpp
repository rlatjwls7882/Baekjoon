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

    for(;N!=1;N/=2) {
        for(int i=0;i*2<N;i++) {
            for(int j=0;j*2<N;j++) {
                int val[4] = {arr[i*2][j*2], arr[i*2+1][j*2], arr[i*2][j*2+1], arr[i*2+1][j*2+1]};
                sort(val, val+4);
                arr[i][j]=val[2];
            }
        }
    }
    cout << arr[0][0];
}