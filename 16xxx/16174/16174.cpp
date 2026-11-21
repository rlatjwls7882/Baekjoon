#include<bits/stdc++.h>
using namespace std;

bool visited[64][64];
int board[64][64];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> board[i][j];
        }
    }

    visited[0][0]=true;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(visited[i][j]) {
                if(i+board[i][j]<N) visited[i+board[i][j]][j]=true;
                if(j+board[i][j]<N) visited[i][j+board[i][j]]=true;
            }
        }
    }
    if(visited[N-1][N-1]) cout << "HaruHaru";
    else cout << "Hing";
}