#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    
    int H, W; cin >> H >> W;
    int A[H][W];
    for(int i=0;i<H;i++) {
        for(int j=0;j<W;j++) {
            cin >> A[i][j];
        }
    }

    int minCost=1000000000;
    for(int m=0;m<H;m++) {
        for(int n=0;n<W;n++) {
            int cost=0;
            for(int i=0;i<H;i++) {
                for(int j=0;j<W;j++) {
                    cost += A[i][j]*min(abs(i-m), abs(j-n));
                }
            }
            minCost = min(cost, minCost);
        }
    }
    cout << minCost;
}