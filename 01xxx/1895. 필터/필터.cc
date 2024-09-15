#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C; cin >> R >> C;
    int arr[R][C];
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            cin >> arr[i][j];
        }
    }
    int T; cin >> T;

    int cnt=0;
    for(int i=0;i<R-2;i++) {
        for(int j=0;j<C-2;j++) {
            int val[9];
            for(int k=0;k<3;k++) {
                for(int l=0;l<3;l++) {
                    val[k*3+l] = arr[i+k][j+l];
                }
            }

            sort(val, val+9);
            if(T<=val[4]) {
                cnt++;
            }
        }
    }
    cout << cnt;
}