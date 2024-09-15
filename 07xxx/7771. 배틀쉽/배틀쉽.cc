#include<bits/stdc++.h>
using namespace std;

int moveX[9] = {1, 1, 1, 0, 0, 0, -1, -1, -1};
int moveY[9] = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    char res[10][10]; fill_n(&res[0][0], 100, '.');
    for(int i=0;i<10;i++) {
        for(int j=0;j<10;j++) {
            int m; cin >> m;
            if(m==100) res[i][j]='#';
        }
    }

    int remain[] = {3, 3, 2, 1};
    for(int i=0;i<10;i++) {
        for(int j=0;j<10;j++) {
            for(int len=0;len<4 && j+len<10;len++) {
                int cnt=0;
                for(int k=0;k<9;k++) {
                    int nextX = i+moveX[k];
                    int nextY = j+len+moveY[k];
                    if(nextX<0 || nextX>=10 || nextY<0 || nextY>=10 || res[nextX][nextY]=='.') cnt++;
                }
                if(cnt==9 && remain[len]) {
                    remain[len]--;
                    while(len>=0) {
                        res[i][j+len--]='#';
                    }
                    break;
                } else if(cnt!=9) {
                    break;
                }
            }
        }
    }

    for(int i=0;i<10;i++) {
        for(int j=0;j<10;j++) {
            cout << res[i][j];
        }
        cout << '\n';
    }
}