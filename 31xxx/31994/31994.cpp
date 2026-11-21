#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string name; int cnt=0;
    for(int i=0;i<7;i++) {
        string curName; int curCnt; cin >> curName >> curCnt;
        if(curCnt>cnt) {
            cnt=curCnt;
            name=curName;
        }
    }
    cout << name;
}