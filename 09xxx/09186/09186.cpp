#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
bool visited[10][15];
string s[10];

int dfs(int x, int y) {
    visited[x][y]=true;
    int cnt=1;
    for(int i=0;i<4;i++) {
        int nx = x+moveX[i];
        int ny = y+moveY[i];
        if(nx<0 || nx>=10 || ny<0 || ny>=15 || s[x][y]!=s[nx][ny] || visited[nx][ny]) continue;
        cnt += dfs(nx, ny);
    }
    return cnt;
}

void fillBoard(int x, int y) {
    visited[x][y]=false;
    for(int i=0;i<4;i++) {
        int nx = x+moveX[i];
        int ny = y+moveY[i];
        if(nx<0 || nx>=10 || ny<0 || ny>=15 || s[x][y]!=s[nx][ny] || !visited[nx][ny]) continue;
        fillBoard(nx, ny);
    }
    s[x][y]='.';
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        for(int i=0;i<10;i++) cin >> s[i];

        int score=0;
        cout << "Game " << tc << ":\n\n";
        for(int moveCnt=1;;moveCnt++) {
            memset(visited, false, sizeof(visited));
            int maxCnt=0, maxX, maxY;
            for(int i=0;i<15;i++) {
                for(int j=9;j>=0;j--) {
                    if(!visited[j][i] && s[j][i]!='.') {
                        int cnt = dfs(j, i);
                        if(maxCnt<cnt) {
                            maxCnt = cnt;
                            maxX = j;
                            maxY = i;
                        }
                    }
                }
            }
            if(maxCnt>=2) {
                int curScore = pow(maxCnt-2, 2);
                score += curScore;
                cout << "Move " << moveCnt << " at (" << 10-maxX << "," << maxY+1 << "): removed " << maxCnt << " balls of color " << s[maxX][maxY] << ", got " << curScore << " points.\n";
                fillBoard(maxX, maxY); // 공 제거

                // 아래로 이동
                for(int i=0;i<15;i++) {
                    int lastBlank=-1;
                    for(int j=9;j>=0;j--) {
                        if(s[j][i]=='.') {
                            if(lastBlank==-1) lastBlank=j;
                        } else if(lastBlank!=-1) {
                            s[lastBlank--][i]=s[j][i];
                            s[j][i]='.';
                        }
                    }
                }

                // 왼쪽으로 이동
                int lastBlank=-1;
                for(int i=0;i<15;i++) {
                    bool chk=true;
                    for(int j=0;j<10;j++) {
                        if(s[j][i]!='.') {
                            chk=false;
                            break;
                        }
                    }

                    if(chk && lastBlank==-1) {
                        lastBlank=i;
                    } else if(!chk && lastBlank!=-1) {
                        for(int j=0;j<10;j++) {
                            s[j][lastBlank] = s[j][i];
                            s[j][i] = '.';
                        }
                        lastBlank++;
                    }
                }
            } else {
                break;
            }
        }

        int remain=0;
        for(int i=0;i<10;i++) {
            for(int j=0;j<15;j++) {
                if(s[i][j]!='.') remain++;
            }
        }
        if(remain==0) score += 1000;
        cout << "Final score: " << score << ", with " << remain << " balls remaining.\n\n";
    }
}