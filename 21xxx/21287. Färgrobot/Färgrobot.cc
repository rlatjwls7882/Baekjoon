#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;

    bool r=0, g=0, b=0;
    for(char ch:s) {
        if(ch=='R') r=1;
        else if(ch=='G') g=1;
        else b=1;
        if(r && g && b) {
            cout << ch;
            r=g=b=0;
            if(--n==0) return 0;
        }
    }
}