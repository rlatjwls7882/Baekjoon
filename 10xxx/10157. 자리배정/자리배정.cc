#include<bits/stdc++.h>

using namespace std;

typedef pair<int, int> P;
bool visited[1000][1000] = {false, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int C, R, K; cin >> C >> R >> K;
    
    if(K>C*R) {
        cout << 0;
    } else {
        int moveX[4] = {-1, 0, 1, 0};
        int moveY[4] = {0, 1, 0, -1};
        
        int move=0;
        P cur = P(R-1, 0);
        while(true) {
            if(--K==0) {
                cout << cur.second+1 << " " << R-cur.first;
                return 0;
            }
            visited[cur.first][cur.second]=true;
            
            for(int i=0;i<4;i++) {
                P next = P(cur.first+moveX[move], cur.second+moveY[move]);
                if(next.first>=0 && next.first<R && next.second>=0 && next.second<C && !visited[next.first][next.second]) {
                    cur=next;
                    break;
                } else {
                    move = (move+1)%4;
                }
            }
        }
    }
}