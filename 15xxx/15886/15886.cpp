#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s;cin >> n >> s;

    int cnt=0;
    for(int i=0;i<n-1;i++) {
        if(s[i]=='E' && s[i+1]=='W') cnt++;
    }
    cout << cnt;
}