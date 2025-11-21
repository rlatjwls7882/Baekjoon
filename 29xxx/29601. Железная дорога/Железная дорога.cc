#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    char ch; int num; cin >> ch >> num;
    if(ch=='R') {
        if(num<=36) cout << (num+3)/4 << " 1";
        else cout << (54-num)/2+1 << " 0";
    } else {
        if(num>36) {
            cout << -1;
            return 0;
        }
        cout << (num+3)/4 << " 1";
    }
    if(num%2) cout << " -1";
    else cout << " 1";
}