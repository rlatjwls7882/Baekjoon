#include<bits/stdc++.h>
using namespace std;

int m[20][20] = {0, };
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int order[n*n];
    vector<set<int>> like = vector<set<int>>(n*n+1);
    for(int i=0;i<n*n;i++) {
        cin >> order[i];
        for(int j=0;j<4;j++) {
            int tmp; cin >> tmp;
            like[order[i]].insert(tmp);
        }
    }

    for(int i=0;i<n*n;i++) {
        int maxLike=0, maxAdj=-1, x, y;
        for(int j=0;j<n;j++) {
            for(int k=0;k<n;k++) {
                if(!m[j][k]) {
                    int curAdj=0, curLike=0;
                    for(int moveCnt=0;moveCnt<4;moveCnt++) {
                        int nextX = j+moveX[moveCnt];
                        int nextY = k+moveY[moveCnt];
                        if(nextX<0 || nextX>=n || nextY<0 || nextY>=n) continue;
                        if(!m[nextX][nextY]) curAdj++;
                        if(like[order[i]].count(m[nextX][nextY])) curLike++;
                    }
                    if(maxLike<curLike || maxLike==curLike && maxAdj<curAdj) {
                        maxLike=curLike;
                        maxAdj=curAdj;
                        x=j;
                        y=k;
                    }
                }
            }
        }
        m[x][y]=order[i];
    }

    int satisfaction=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            int cnt=0;
            for(int moveCnt=0;moveCnt<4;moveCnt++) {
                int nextX = i+moveX[moveCnt];
                int nextY = j+moveY[moveCnt];
                if(nextX<0 || nextX>=n || nextY<0 || nextY>=n) continue;
                if(like[m[i][j]].count(m[nextX][nextY])) cnt++;
            }
            if(cnt==0) satisfaction+=0;
            else if(cnt==1) satisfaction+=1;
            else if(cnt==2) satisfaction+=10;
            else if(cnt==3) satisfaction+=100;
            else satisfaction+=1000;
        }
    }
    cout << satisfaction;
}