#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int pos[3][2];
    for(int i=0;i<3;i++) {
        for(int j=0;j<2;j++) {
            cin >> pos[i][j];
        }
    }

    if((pos[1][0]-pos[0][0])*(pos[2][1]-pos[1][1]) == (pos[2][0]-pos[1][0])*(pos[1][1]-pos[0][1])) {
        cout << "WHERE IS MY CHICKEN?";
    } else {
        cout << "WINNER WINNER CHICKEN DINNER!";
    }
}