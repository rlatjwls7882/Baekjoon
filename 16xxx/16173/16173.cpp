#include <bits/stdc++.h>
using namespace std;

bool visited[3][3] = {false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int map[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> map[i][j];
        }
    }

    visited[0][0]=true;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(visited[i][j]) {
                if(i+map[i][j]<N) visited[i+map[i][j]][j]=true;
                if(j+map[i][j]<N) visited[i][j+map[i][j]]=true;
            }
        }
    }

    if(map[N-1][N-1]==-1 && visited[N-1][N-1]) cout << "HaruHaru";
    else cout << "Hing";
}