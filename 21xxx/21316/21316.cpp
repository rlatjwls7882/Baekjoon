#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    vector<vector<int>> connect = vector<vector<int>>(13);
    for(int i=0;i<12;i++) {
        int x, y; cin >> x >> y;
        connect[x].push_back(y);
        connect[y].push_back(x);
    }

    for(int i=1;i<=12;i++) {
        if(connect[i].size()==3) {
            bool chk[4] = {false, };
            for(int next:connect[i]) {
                chk[connect[next].size()]=true;
            }
            if(chk[1] && chk[2] && chk[3]) {
                cout << i;
                return 0;
            }
        }
    }
}