#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    vector<set<int>> conn(n);
    for(int i=0;i<n;i++) {
        int L, R; cin >> L >> R;
        conn[i].insert(L-1);
        conn[i].insert(R-1);
    }

    bool lastVisited[1000] = {true, false, };
    for(int t=1;t<=1000;t++) {
        bool curVisited[1000] = {false, };
        for(int cur=0;cur<n;cur++) {
            if(lastVisited[cur]) {
                for(int next:conn[cur]) curVisited[next] = true;
            }
        }

        if(!curVisited[0] && t>=10) {
            cout << t;
            return 0;
        }
        memcpy(lastVisited, curVisited, sizeof(curVisited));
    }
    cout << -1;
}