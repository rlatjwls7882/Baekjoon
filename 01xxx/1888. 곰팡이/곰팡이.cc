#include<bits/stdc++.h>
using namespace std;

int m, n;
string s[100];
bool visited[10000];
int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};
void bfs(int x, int y) {
    queue<pair<int, int>> q; q.push(make_pair(x, y));
    visited[x*n+y]=true;
    while(!q.empty()) {
        pair<int, int> cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            int nextX = cur.first+moveX[i];
            int nextY = cur.second+moveY[i];
            if(nextX<0 || nextX>=m || nextY<0 || nextY>=n || s[nextX][nextY]=='0' || visited[nextX*n+nextY]) continue;
            visited[nextX*n+nextY]=true;
            q.push(make_pair(nextX, nextY));
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> m >> n;
    for(int i=0;i<m;i++) {
        cin >> s[i];
    }

    for(int t=0;;t++) {
        int cnt=0;
        fill(visited, visited+m*n, false);
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(!visited[i*n+j] && s[i][j]!='0') {
                    bfs(i, j);
                    cnt++;
                }
            }
        }
        if(cnt<=1) {
            cout << t;
            return 0;
        }

        string nextS[m];
        for(int i=0;i<m;i++) {
            nextS[i]=s[i];
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(s[i][j]) {
                    int val = s[i][j]-'0';
                    for(int k=i-val;k<=i+val;k++) {
                        for(int l=j-val;l<=j+val;l++) {
                            if(k<0 || k>=m || l<0 || l>=n) continue;
                            nextS[k][l] = max(nextS[k][l], s[i][j]);
                        }
                    }
                }
            }
        }
        for(int i=0;i<m;i++) {
            s[i]=nextS[i];
        }
    }
}