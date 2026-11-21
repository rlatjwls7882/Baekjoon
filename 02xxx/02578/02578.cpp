#include<bits/stdc++.h>

using namespace std;

int cnt=0;
int bingo[5][5];
bool chk[5][5] = {false, };

void chkLine(int x, int y) {
    int cntRow=0, cntCol=0;
    for(int i=0;i<5;i++) {
        if(chk[i][y]) {
            cntRow++;
        }
        if(chk[x][i]) {
            cntCol++;
        }
    }
    if(cntRow==5) {
        cnt++;
    }
    if(cntCol==5) {
        cnt++;
    }

    if(x==y) {
        int cnt1=0;
        for(int i=0;i<5;i++) {
            if(chk[i][i]) {
                cnt1++;
            }
        }
        if(cnt1==5) {
            cnt++;
        }
    }

    if(x==4-y) {
        int cnt1=0;
        for(int i=0;i<5;i++) {
            if(chk[i][4-i]) {
                cnt1++;
            }
        }
        if(cnt1==5) {
            cnt++;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=0;i<5;i++) {
        for(int j=0;j<5;j++) {
            cin >> bingo[i][j];
        }
    }

    for(int i=1;i<=25;i++) {
        int tmp; cin >> tmp;
        for(int j=0;j<5;j++) {
            for(int k=0;k<5;k++) {
                if(bingo[j][k]==tmp) {
                    chk[j][k]=true;
                    chkLine(j, k);
                }
            }
        }
        if(cnt>=3) {
            cout << i;
            break;
        }
    }
}