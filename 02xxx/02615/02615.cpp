#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int m[19][19];
    for(int i=0;i<19;i++) {
        for(int j=0;j<19;j++) {
            cin >> m[i][j];
        }
    }

    for(int i=0;i<19;i++) {
        for(int j=0;j<19;j++) {
            if(m[i][j]) {
                int cntCol=1, cntRow=1, cntCross1=1, cntCross2=1;
                for(int k=1;k<5;k++) {
                    if(j+k<19 && m[i][j+k]==m[i][j]) cntCol++;
                    if(i+k<19 && m[i+k][j]==m[i][j]) cntRow++;
                    if(i+k<19 && j+k<19 && m[i+k][j+k]==m[i][j]) cntCross1++;
                    if(i-k>=0 && j+k<19 && m[i-k][j+k]==m[i][j]) cntCross2++;
                }
                if(j+5<19 && m[i][j+5]==m[i][j] || j-1>=0 && m[i][j-1]==m[i][j]) cntCol--;
                if(i+5<19 && m[i+5][j]==m[i][j] || i-1>=0 && m[i-1][j]==m[i][j]) cntRow--;
                if(i+5<19 && j+5<19 && m[i+5][j+5]==m[i][j] || i-1>=0 && j-1>=0 && m[i-1][j-1]==m[i][j]) cntCross1--;
                if(i-5>=0 && j+5<19 && m[i-5][j+5]==m[i][j] || i+1<19 && j-1>=0 && m[i+1][j-1]==m[i][j]) cntCross2--;

                if(cntCol==5 || cntRow==5 || cntCross1==5 || cntCross2==5) {
                    cout << m[i][j] << '\n';
                    cout << i+1 << ' ' << j+1;
                    return 0;
                }
            }
        }
    }
    cout << 0;
}