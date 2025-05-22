#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;

    int cnt=0;
    for(int i=1;i<n;i++) {
        if(s[i]==']' || s[i]=='[' && s[i-1]!=']') cnt++;
        else if(s[i]=='2' || s[i]=='5') {
            if(s[i]==s[i-1]) cnt+=2;
            else cnt++;
        }
    }
    cout << cnt;
}