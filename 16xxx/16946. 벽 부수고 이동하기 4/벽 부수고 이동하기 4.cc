#include <bits/stdc++.h>
using namespace std;

int N, M, cnt=1;
vector<int> sizes;
int label[1000][1000] = {0, };
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
string m[1000];

void bfs(int x, int y) {
    queue<pair<int, int>> q; q.push(make_pair(x, y));
    label[x][y]=cnt;
    int curSize=1;
    while(!q.empty()) {
        pair<int, int> cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            pair<int, int> next = make_pair(cur.first+moveX[i], cur.second+moveY[i]);
            if(next.first<0 || next.first>=N || next.second<0 || next.second>=M || label[next.first][next.second] || m[next.first][next.second]=='1') continue;
            label[next.first][next.second]=cnt;
            curSize++;
            q.push(next);
        }
    }
    sizes.push_back(curSize);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]=='0' && !label[i][j]) {
                bfs(i, j);
                cnt++;
            }
        }
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]=='0') {
                cout << '0';
            } else {
                set<int> labels;
                for(int k=0;k<4;k++) {
                    int nextX = i+moveX[k];
                    int nextY = j+moveY[k];
                    if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || m[nextX][nextY]=='1') continue;
                    labels.insert(label[nextX][nextY]);
                }
                int canVisit=1;
                for(int labelNum:labels) {
                    canVisit += sizes[labelNum-1];
                }
                cout << canVisit%10;
            }
        }
        cout << '\n';
    }
}