#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int size = pow(2, n);
        bool win[size][size]; memset(win, false, sizeof(win));
        int winCnt[size] = {0, }, loseCnt[size] = {0, };
        for(int curSize=2;curSize<=size;curSize*=2) {
            for(int i=0;i<size;i+=curSize) {
                int winner; cin >> winner;
                for(int j=i;j<i+curSize;j++) {
                    if(winner-1!=j && !win[winner-1][j]) {
                        winCnt[winner-1]++;
                        loseCnt[j]++;
                    }
                    win[winner-1][j]=true;
                }
            }
        }

        int m; cin >> m;
        while(m-->0) {
            int p; cin >> p;
            cout << "Player "<< p <<" can be ranked as high as " << loseCnt[p-1]+1 << " or as low as " << size-winCnt[p-1] << ".\n";
        }
        cout << '\n';
    }
}