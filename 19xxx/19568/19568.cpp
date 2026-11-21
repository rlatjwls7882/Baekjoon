#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=1;i<=30;i++) {
        for(int j=1;j<=30;j++) {
            if(i<15 && j==15) cout << "1 ";
            else if(i==15 && j<15) cout << "15 ";
            else if(i==15 && j>15) cout << "225 ";
            else if(i>15 && j==15) cout << "3375 ";
            else cout << "0 ";
        }
        cout << '\n';
    }
}