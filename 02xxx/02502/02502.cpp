#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int D, K; cin >> D >> K;

    int num[D][2] = {{1, 0}, {0, 1}};
    for(int i=2;i<D;i++) {
        num[i][0]=num[i-1][0]+num[i-2][0];
        num[i][1]=num[i-1][1]+num[i-2][1];
    }

    for(int i=1;i<K;i++) {
        if((K-i*num[D-1][0])%num[D-1][1]==0) {
            cout << i << endl << (K-i*num[D-1][0])/num[D-1][1];
            break;
        }
    }
}