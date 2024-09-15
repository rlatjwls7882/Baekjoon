#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int a[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> a[i][j];
        }
    }

    int b[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> b[i][j];
        }
    }

    int c[N][N];
    int cnt=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            int chk=0;
            for(int k=0;k<N;k++) {
                chk += a[i][k]&b[k][j];
                if(chk) break;
            }
            if(chk) cnt++;
        }
    }
    cout << cnt;
}