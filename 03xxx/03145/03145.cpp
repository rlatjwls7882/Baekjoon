#include<bits/stdc++.h>
using namespace std;

int A[2500], parent[2500];
bool visited[2500] = {false, };
int moveX[8] = {1, 1, 1, 0, 0, -1, -1, -1};
int moveY[8] = {-1, 0, 1, -1, 1, -1, 0, 1};
vector<set<int>> conn(2500);

int dfs(int cur) {
    visited[cur]=true;
    for(int next:conn[cur]) {
        if(A[next]==-1 || !visited[A[next]] && dfs(A[next])) {
            A[cur]=next;
            A[next]=cur;
            return true;
        }
    }
    return false;
}

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C; cin >> R >> C;
    string s[R];
    for(int i=0;i<R;i++) {
        cin >> s[i];
    }

    for(int i=0;i<R*C;i++) {
        parent[i]=i;
    }

    vector<pair<int, int>> pos;
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(j>=1 && s[i][j]!='x' && s[i][j]!='.' && s[i][j-1]!='x' && s[i][j-1]!='.') {
                parent[i*C+j] = _find(parent[i*C+j-1]);
            } else if(s[i][j]=='x') {
                pos.push_back({i, j});
            }
        }
    }

    for(auto village:pos) {
        for(int i=0;i<8;i++) {
            int nextX = village.first+moveX[i];
            int nextY = village.second+moveY[i];
            if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || s[nextX][nextY]=='x' || s[nextX][nextY]=='.') continue;
            conn[village.first*C+village.second].insert(_find(parent[nextX*C+nextY]));
        }
    }

    fill(A, A+R*C, -1);
    for(auto village:pos) {
        fill(visited, visited+R*C, false);
        dfs(village.first*C+village.second);
    }
    for(auto village:pos) {
        cout << village.first+1 << ' ' << village.second+1 << ' ';
        int x = A[village.first*C+village.second]/C;
        int y = A[village.first*C+village.second]%C;
        for(int i=y;i<C;i++) {
            if(s[x][i]=='x' || s[x][i]=='.') break;
            cout << s[x][i];
        }
        cout << '\n';
    }
}