#include<bits/stdc++.h>
using namespace std;

string s[15];

int n, m;
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

int dfs(int depth=0, int cnt=1) {
    if(depth==2) return cnt;

    int maxCnt=1;
    for(int x=0;x<n;x++) {
        for(int y=0;y<m;y++) {
            if(s[x][y]=='#') {
                int len=0;
                s[x][y]='.';

                // 크기가 1인 경우
                maxCnt = max(maxCnt, dfs(depth+1, cnt));

                // 크기가 2 이상인 경우
                while(true) {
                    bool chk=true;
                    for(int i=0;i<4;i++) {
                        int nx = x+dx[i]*(len+1);
                        int ny = y+dy[i]*(len+1);
                        if(nx<0 || nx>=n || ny<0 || ny>=m || s[nx][ny]=='.') {
                            chk=false;
                            break;
                        }
                    }
                    if(chk) {
                        len++;
                        for(int i=0;i<4;i++) {
                            int nx = x+dx[i]*len;
                            int ny = y+dy[i]*len;
                            s[nx][ny]='.';
                        }
                        maxCnt = max(maxCnt, dfs(depth+1, cnt*(len*4+1)));
                    } else {
                        break;
                    }
                }

                // 땅 되돌리기
                s[x][y]='#';
                for(int i=1;i<=len;i++) {
                    for(int j=0;j<4;j++) {
                        int nx = x+dx[j]*i;
                        int ny = y+dy[j]*i;
                        s[nx][ny]='#';
                    }
                }
            }
        }
    }
    return maxCnt;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) cin >> s[i];
    cout << dfs();
}