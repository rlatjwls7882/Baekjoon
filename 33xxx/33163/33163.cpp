#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;
    for(char ch:s) {
        if(ch=='J') cout << 'O';
        else if(ch=='O') cout << 'I';
        else cout << 'J';
    }
}