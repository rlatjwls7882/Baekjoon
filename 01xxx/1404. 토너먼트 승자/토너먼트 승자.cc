#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double prob[8][8];
    for(int i=0;i<7;i++) {
        for(int j=i+1;j<8;j++) {
            int tmp; cin >> tmp;
            prob[i][j] = tmp*0.01;
            prob[j][i] = 1-tmp*0.01;
        }
    }

    double round1[8];
    for(int i=0;i<8;i+=2) {
        round1[i] = prob[i][i+1];
        round1[i+1] = prob[i+1][i];
    }

    double round2[8];
    for(int i=0;i<8;i+=4) {
        round2[i] = round1[i]*(round1[i+2]*prob[i][i+2]+round1[i+3]*prob[i][i+3]);
        round2[i+1] = round1[i+1]*(round1[i+2]*prob[i+1][i+2]+round1[i+3]*prob[i+1][i+3]);
        round2[i+2] = round1[i+2]*(round1[i]*prob[i+2][i]+round1[i+1]*prob[i+2][i+1]);
        round2[i+3] = round1[i+3]*(round1[i]*prob[i+3][i]+round1[i+1]*prob[i+3][i+1]);
    }

    double round3[8];
    round3[0] = round2[0]*(round2[4]*prob[0][4]+round2[5]*prob[0][5]+round2[6]*prob[0][6]+round2[7]*prob[0][7]);
    round3[1] = round2[1]*(round2[4]*prob[1][4]+round2[5]*prob[1][5]+round2[6]*prob[1][6]+round2[7]*prob[1][7]);
    round3[2] = round2[2]*(round2[4]*prob[2][4]+round2[5]*prob[2][5]+round2[6]*prob[2][6]+round2[7]*prob[2][7]);
    round3[3] = round2[3]*(round2[4]*prob[3][4]+round2[5]*prob[3][5]+round2[6]*prob[3][6]+round2[7]*prob[3][7]);
    round3[4] = round2[4]*(round2[0]*prob[4][0]+round2[1]*prob[4][1]+round2[2]*prob[4][2]+round2[3]*prob[4][3]);
    round3[5] = round2[5]*(round2[0]*prob[5][0]+round2[1]*prob[5][1]+round2[2]*prob[5][2]+round2[3]*prob[5][3]);
    round3[6] = round2[6]*(round2[0]*prob[6][0]+round2[1]*prob[6][1]+round2[2]*prob[6][2]+round2[3]*prob[6][3]);
    round3[7] = round2[7]*(round2[0]*prob[7][0]+round2[1]*prob[7][1]+round2[2]*prob[7][2]+round2[3]*prob[7][3]);

    cout.precision(9);
    cout << fixed;
    for(int i=0;i<8;i++) {
        cout << round3[i] << ' ';
    }
}