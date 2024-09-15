#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M, N, B; cin >> M >> N >> B;
    int m[M][N];
    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
        }
    }

    int minT=INT_MAX, h=0;
    for(int i=0;i<=256;i++) {
        int crash=0, install=0;
        for(int j=0;j<M;j++) {
            for(int k=0;k<N;k++) {
                if(m[j][k]>i) {
                    crash += m[j][k]-i;
                } else if(m[j][k]<i) {
                    install += i-m[j][k];
                }
            }
        }

        if(install-crash<=B) {
            int curT = crash*2+install;
            if(curT<=minT) {
                minT=curT;
                h=i;
            }
        }
    }
    cout << minT << ' ' << h;
}