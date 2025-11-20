#include<bits/stdc++.h>
using namespace std;

int a, b;
string board[10];

bool chkRow(int skip) {
    char ch=0;
    for(int i=0;i<a;i++) {
        if(skip==i) continue;
        for(int j=0;j<b;j++) {
            if(!ch) ch=board[i][j];
            else if(ch!=board[i][j]) return false;
        }
    }
    return true;
}

bool chkCol(int skip) {
    char ch=0;
    for(int i=0;i<a;i++) {
        for(int j=0;j<b;j++) {
            if(skip==j) continue;
            if(!ch) ch=board[i][j];
            else if(ch!=board[i][j]) return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> a >> b;
    for(int i=0;i<a;i++) cin >> board[i];

    for(int i=0;i<a;i++) {
        if(chkRow(i)) {
            cout << "Yes";
            return 0;
        }
    }
    for(int i=0;i<b;i++) {
        if(chkCol(i)) {
            cout << "Yes";
            return 0;
        }
    }
    cout << "No";
}