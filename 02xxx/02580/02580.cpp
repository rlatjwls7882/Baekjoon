#include<bits/stdc++.h>
using namespace std;

int cnt=0;
bool chk=false;
vector<pair<int, int>> v;
bool col[9][10] = {false, };
bool row[9][10] = {false, };
bool square[9][10] = {false, };
int m[9][9];

void dfs(int depth, int start) {
    if(depth==cnt) {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                cout << m[i][j] << ' ';
            }
            cout << '\n';
        }
        chk=true;
        return;
    }

    int a = v[start].first;
    int b = v[start].second;
    int squareCnt = a/3*3 + b/3;
    for(int j=1;j<=9;j++) {
        if(!col[a][j] && !row[b][j] && !square[squareCnt][j]) {
            col[a][j]=true;
            row[b][j]=true;
            square[squareCnt][j]=true;
            m[a][b]=j;

            dfs(depth+1, start+1);
            if(chk) return;
            
            col[a][j]=false;
            row[b][j]=false;
            square[squareCnt][j]=false;
            m[a][b]=0;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=0;i<9;i++) {
        for(int j=0;j<9;j++) {
            cin >> m[i][j];
            if(m[i][j]==0) {
                v.push_back(make_pair(i, j));
                cnt++;
            } else {
                col[i][m[i][j]]=true;
                row[j][m[i][j]]=true;
                square[i/3*3 + j/3][m[i][j]]=true;
            }
        }
    }

    dfs(0, 0);
}