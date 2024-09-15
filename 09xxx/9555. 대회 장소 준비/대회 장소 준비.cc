#include <bits/stdc++.h>
using namespace std;

int moveX[8] = {1, 1, 1, 0, 0, -1, -1, -1};
int moveY[8] = {-1, 0, 1, -1, 1, -1, 0, 1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N, M; cin >> N >> M;
        int m[N][M];
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                cin >> m[i][j];
            }
        }

        bool chk[101] = {false, };
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(m[i][j]!=-1 || !chk[m[i][j]]) {
                    for(int k=0;k<8;k++) {
                        int nextX = i+moveX[k];
                        int nextY = j+moveY[k];
                        if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || m[i][j]!=m[nextX][nextY]) continue;
                        chk[m[i][j]]=true;
                        break;
                    }
                }
            }
        }

        int cnt=0;
        for(int i=1;i<=100;i++) {
            if(chk[i]) cnt++;
        }
        cout << cnt << '\n';
    }
}