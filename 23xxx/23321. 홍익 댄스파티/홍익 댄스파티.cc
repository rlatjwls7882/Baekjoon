#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string m[5];
    for(int i=0;i<5;i++) {
        cin >> m[i];
    }

    for(int i=0;i<m[0].length();i++) {
        if(m[3][i]=='l') {
            m[0][i]='o';
            m[1][i]='w';
            m[2][i]='l';
            m[3][i]='n';
            m[4][i]='.';
        } else if(m[3][i]=='n') {
            m[0][i]='.';
            m[1][i]='o';
            m[2][i]='m';
            m[3][i]='l';
            m[4][i]='n';
        }
    }

    for(int i=0;i<5;i++) {
        cout << m[i] << '\n';
    }
}