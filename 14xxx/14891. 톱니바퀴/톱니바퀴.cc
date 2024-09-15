#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string cogwheel[4];
    for(int i=0;i<4;i++) {
        cin >> cogwheel[i];
    }

    int K; cin >> K;
    while(K-->0) {
        int a, b; cin >> a >> b; a--;

        if(b==1) {
            char tmp = cogwheel[a][7];
            for(int i=7;i>0;i--) {
                cogwheel[a][i] = cogwheel[a][i-1];
            }
            cogwheel[a][0] = tmp;
        } else {
            char tmp = cogwheel[a][0];
            for(int i=0;i<7;i++) {
                cogwheel[a][i] = cogwheel[a][i+1];
            }
            cogwheel[a][7] = tmp;
        }

        for(int i=a+1, j=-b;i<4;i++, j=-j) {
            if(j==-1 && cogwheel[i-1][3] != cogwheel[i][6] || j==1 && cogwheel[i-1][1] != cogwheel[i][6]) {
                if(j==1) {
                    char tmp = cogwheel[i][7];
                    for(int k=7;k>0;k--) {
                        cogwheel[i][k] = cogwheel[i][k-1];
                    }
                    cogwheel[i][0] = tmp;
                } else {
                    char tmp = cogwheel[i][0];
                    for(int k=0;k<7;k++) {
                        cogwheel[i][k] = cogwheel[i][k+1];
                    }
                    cogwheel[i][7] = tmp;
                }
            } else {
                break;
            }
        }
        for(int i=a-1, j=-b;i>=0;i--, j=-j) {
            if(j==-1 && cogwheel[i+1][7] != cogwheel[i][2] || j==1 && cogwheel[i+1][5] != cogwheel[i][2]) {
                if(j==1) {
                    char tmp = cogwheel[i][7];
                    for(int k=7;k>0;k--) {
                        cogwheel[i][k] = cogwheel[i][k-1];
                    }
                    cogwheel[i][0] = tmp;
                } else {
                    char tmp = cogwheel[i][0];
                    for(int k=0;k<7;k++) {
                        cogwheel[i][k] = cogwheel[i][k+1];
                    }
                    cogwheel[i][7] = tmp;
                }
            } else {
                break;
            }
        }
    }

    int score=0;
    for(int i=0;i<4;i++) {
        if(cogwheel[i][0]=='1') score += pow(2, i);
    }
    cout << score;
}