#include<bits/stdc++.h>
using namespace std;

int A[2500];
bool visited[2500];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
vector<vector<pair<int, int>>> conn(2500);

int dfs(int cur, int minTime) {
    visited[cur]=true;
    for(pair<int, int> next:conn[cur]) {
        if(next.second>minTime) return false;
        if(A[next.first]==-1 || !visited[A[next.first]] && dfs(A[next.first], minTime)) {
            A[cur]=next.first;
            A[next.first]=cur;
            return true;
        }
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C; cin >> R >> C;
    string m[R];
    for(int i=0;i<R;i++) {
        cin >> m[i];
    }

    vector<int> start;
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(m[i][j]=='C') {
                queue<pair<int, int>> q; q.push({i*C+j, 0});
                bool qVisited[R][C];
                memset(qVisited, false, sizeof(qVisited));
                qVisited[i][j]=true;
                start.push_back(i*C+j);
                while(!q.empty()) {
                    pair<int, int> cur = q.front(); q.pop();
                    if(m[cur.first/C][cur.first%C]=='P') {
                        conn[i*C+j].push_back({cur.first, cur.second});
                        conn[cur.first].push_back({i*C+j, cur.second});
                    }
                    for(int k=0;k<4;k++) {
                        int nextX = cur.first/C+moveX[k];
                        int nextY = cur.first%C+moveY[k];
                        if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || m[nextX][nextY]=='X' || qVisited[nextX][nextY]) continue;
                        qVisited[nextX][nextY]=true;
                        q.push({nextX*C+nextY, cur.second+1});
                    }
                }
            }
        }
    }

    for(int i=0;i<R*C;i++) {
        sort(conn[i].begin(), conn[i].end(), [](pair<int, int> a, pair<int, int> b) { return a.second < b.second; });
    }

    int left=0, right=R*C;
    while(left<right) {
        int mid = (left+right)/2;
        bool possible=true;
        fill(A, A+R*C, -1);
        for(int cur:start) {
            fill(visited, visited+R*C, false);
            if(!dfs(cur, mid)) {
                possible=false;
                break;
            }
        }
        if(possible) right=mid;
        else left=mid+1;
    }
    if(left==R*C) cout << -1;
    else cout << left;
}