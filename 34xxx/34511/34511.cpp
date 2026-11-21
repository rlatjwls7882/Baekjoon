#include<bits/stdc++.h>
using namespace std;

string s[100];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> s[i];

    int len=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(i+1<n && (s[i][j]=='X' && s[i+1][j]=='Y' || s[i][j]=='Y' && s[i+1][j]=='X')) len++;
            if(j+1<m && (s[i][j]=='X' && s[i][j+1]=='Y' || s[i][j]=='Y' && s[i][j+1]=='X')) len++;
        }
    }
    cout << len;
}