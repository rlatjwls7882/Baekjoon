#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b; cin >> a >> b;

    if((a==1||a==3||a==4)&&(b==1||b==3||b==4) || a==b) {
        cout << '=';
    } else if((a==0&&b==2||a==2&&b==5||a==5&&b==0||(a!=1&&a!=3&&a!=4)&&(b==1||b==3||b==4))) {
        cout << '>';
    } else {
        cout << '<';
    }
}