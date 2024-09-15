#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int H, W, X, Y; cin >> H >> W >> X >> Y;
    int B[H+X][W+Y];
    for(int i=0;i<H+X;i++) {
        for(int j=0;j<W+Y;j++) {
            cin >> B[i][j];
        }
    }

    int A[H][W];
    for(int i=0;i<H;i++) {
        for(int j=0;j<W;j++) {
            A[i][j]=B[i][j];
            if(i-X>=0 && j-Y>=0) A[i][j] -= A[i-X][j-Y];
        }
    }

    for(int i=0;i<H;i++) {
        for(int j=0;j<W;j++) {
            cout << A[i][j] << " ";
        }
        cout << '\n';
    }
}