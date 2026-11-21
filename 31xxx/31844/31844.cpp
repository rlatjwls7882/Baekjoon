#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    int idxRobot, idxBox, idxTarget;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='@') {
            idxRobot=i;
        } else if(s[i]=='#') {
            idxBox=i;
        } else if(s[i]=='!') {
            idxTarget=i;
        }
    }

    if(idxRobot<idxBox && idxBox<idxTarget || idxTarget<idxBox && idxBox<idxRobot) {
        cout << abs(idxTarget-idxRobot)-1;
    } else {
        cout << -1;
    }
}