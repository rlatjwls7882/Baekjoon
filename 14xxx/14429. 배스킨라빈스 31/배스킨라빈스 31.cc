#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int minTurn=INT_MAX, idx=0;
    for(int i=1;i<=n;i++) {
        int j, m; cin >> j >> m;
        int turn = ((j-1)/(m+1)+1)*2;
        if(turn<minTurn) {
            minTurn=turn;
            idx=i;
        }
    }
    cout << idx << ' ' << minTurn;
}