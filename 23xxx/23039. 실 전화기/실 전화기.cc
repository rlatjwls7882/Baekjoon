#include<bits/stdc++.h>
using namespace std;

bool connect[6][6] = {false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    for(int i=0;i<N;i++) {
        int u, v; cin >> u >> v;
        connect[u][v]=true;
        connect[v][u]=true;
    }

    if(N==10) {
        cout << -1;
        return 0;
    }

    int cnt=0;
    if(connect[1][3] && connect[2][4]) cnt++;
    if(connect[1][3] && connect[2][5]) cnt++;
    if(connect[1][4] && connect[3][5]) cnt++;
    if(connect[1][4] && connect[2][5]) cnt++;
    if(connect[2][4] && connect[3][5]) cnt++;

    if(cnt==0) {
        cout << 0;
    } else {
        for(int i=1;i<=5;i++) { // 한 정점을 지웠을때의 교차점의 개수 계산
            cnt=0;
            if(i==5 && connect[1][3] && connect[2][4]) cnt++;
            if(i==4 && connect[1][3] && connect[2][5]) cnt++;
            if(i==2 && connect[1][4] && connect[3][5]) cnt++;
            if(i==3 && connect[1][4] && connect[2][5]) cnt++;
            if(i==1 && connect[2][4] && connect[3][5]) cnt++;
            if(cnt==0) {
                cout << 1;
                return 0;
            }
        }
        cout << 2;
    }
}