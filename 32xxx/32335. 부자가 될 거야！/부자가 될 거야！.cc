#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    string s; cin >> s;
    for(int i=0;i<n-1;i++) {
        if(s[i]!='0' && 10-(s[i]-'0')<=m) {
            m -= 10-(s[i]-'0');
            s[i]='0';
        }
        cout << s[i];
    }
    cout << (s[n-1]-'0'+m)%10;
}