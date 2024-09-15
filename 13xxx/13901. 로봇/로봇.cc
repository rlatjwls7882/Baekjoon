#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {-1, 1, 0, 0};
int moveY[4] = {0, 0, -1, 1};

bool visited[1000][1000] = {false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C, k; cin >> R >> C >> k;
    while(k-->0) {
        int br, bc; cin >> br >> bc;
        visited[br][bc]=true;
    }

    int sr, sc; cin >> sr >> sc;
    visited[sr][sc]=true;
    int move[4];
    for(int i=0;i<4;i++) {
        cin >> move[i];
        move[i]--;
    }

    while(true) {
        bool change=false;
        for(int i=0;i<4;i++) {
            while(true) {
                int nextX = sr+moveX[move[i]];
                int nextY = sc+moveY[move[i]];
                if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || visited[nextX][nextY]) break;
                visited[nextX][nextY]=true;
                sr = nextX;
                sc = nextY;
                change=true;
            }
        }
        if(!change) break;
    }
    cout << sr << ' ' << sc;
}