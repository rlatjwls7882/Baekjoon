#include<bits/stdc++.h>
using namespace std;

bool chk[200001][7];

int main() {
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        memset(chk, 0, sizeof chk);
        chk[0][1]=true;
        for(int i=0;i<n;i++) {
            char op1, op2; int v1, v2; cin >> op1 >> v1 >> op2 >> v2;
            for(int j=0;j<7;j++) {
                if(chk[i][j]) {
                    if(op1=='+') chk[i+1][(j+v1)%7]=true;
                    else chk[i+1][j*v1%7]=true;
                    if(op2=='+') chk[i+1][(j+v2)%7]=true;
                    else chk[i+1][j*v2%7]=true;
                }
            }
        }
        if(chk[n][0]) cout << "LUCKY\n";
        else cout << "UNLUCKY\n";
    }
}