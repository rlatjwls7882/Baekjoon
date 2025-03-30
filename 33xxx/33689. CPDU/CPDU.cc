#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    
    int cnt=0;
    while(n--) {
        string s; cin >> s;
        if(s[0]=='C') cnt++;
    }
    cout << cnt;
}