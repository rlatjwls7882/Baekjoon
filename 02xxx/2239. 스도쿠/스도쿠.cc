#include <bits/stdc++.h>
using namespace std;

int cnt=0;
string m[9];
bool square[9][9] = {false, };
bool row[9][9] = {false, };
bool col[9][9] = {false, };

void backTracking(int i, int j) {
    if(cnt==0) return;
    if(m[i][j]=='0') {
        for(int k=0;k<9;k++) {
            if(!square[i/3*3+j/3][k] && !row[i][k] && !col[j][k]) {
                square[i/3*3+j/3][k]=true;
                row[i][k]=true;
                col[j][k]=true;
                m[i][j]='1'+k;
                cnt--;

                backTracking((i*9+j+1)/9, (i*9+j+1)%9);
                if(cnt==0) return;

                square[i/3*3+j/3][k]=false;
                row[i][k]=false;
                col[j][k]=false;
                m[i][j]='0';
                cnt++;
            }
        }
    } else {
        backTracking((i*9+j+1)/9, (i*9+j+1)%9);
        if(cnt==0) return;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=0;i<9;i++) {
        cin >> m[i];
    }

    for(int i=0;i<9;i++) {
        for(int j=0;j<9;j++) {
            if(m[i][j]!='0') {
                square[i/3*3+j/3][m[i][j]-'1']=true;
                row[i][m[i][j]-'1']=true;
                col[j][m[i][j]-'1']=true;
            } else {
                cnt++;
            }
        }
    }

    backTracking(0, 0);

    for(int i=0;i<9;i++) {
        cout << m[i] << '\n';
    }
}