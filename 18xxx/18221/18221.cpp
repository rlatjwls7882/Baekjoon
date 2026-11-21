#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int m[N][N];
    pair<int, int> pos2, pos5;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
            if(m[i][j]==2) pos2 = make_pair(i, j);
            else if(m[i][j]==5) pos5 = make_pair(i, j);
        }
    }

    if(pow(pos2.first-pos5.first, 2)+pow(pos2.second-pos5.second, 2)<25) {
        cout << 0;
        return 0;
    }

    int cnt=0;
    for(int i=min(pos2.first, pos5.first);i<=max(pos2.first, pos5.first);i++) {
        for(int j=min(pos2.second, pos5.second);j<=max(pos2.second, pos5.second);j++) {
            if(m[i][j]==1) {
                cnt++;
            }
        }
    }

    if(cnt>=3) {
        cout << 1;
    } else {
        cout << 0;
    }
}