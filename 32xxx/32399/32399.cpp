#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    if(s.compare("(1)")==0) cout << 0;
    else if(s.compare(")1(")==0) cout << 2;
    else cout << 1;
}