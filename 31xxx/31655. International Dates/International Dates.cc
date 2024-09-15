#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string s; cin >> s;
    int AA, BB; AA=(s[0]-'0')*10+(s[1]-'0'); BB=(s[3]-'0')*10+(s[4]-'0');
    
    if(AA<=12&&BB<=12) {
        cout << "either";
    } else if(AA<=12) {
        cout << "US";
    } else {
        cout << "EU";
    }
}