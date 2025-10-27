#include<bits/stdc++.h>
using namespace std;

int n, m;
string s[3000];

bool chk() {
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(s[i][j]=='.') return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {   
        cin >> n >> m;
        for(int i=0;i<n;i++) cin >> s[i];
        for(int j=0;j<m;j++) {
            for(int i=n-1;i>0;i--) {
                if(j+1<m && s[i][j]=='.' && s[i-1][j]=='.' && s[i][j+1]=='.') s[i][j]=s[i-1][j]=s[i][j+1]='a';
                if(j+1<m && s[i][j]=='.' && s[i][j+1]=='.' && s[i-1][j+1]=='.') s[i][j]=s[i][j+1]=s[i-1][j+1]='b';
            }
        }
        if(chk()) for(int i=0;i<n;i++) cout << s[i] << '\n';
        else cout << "-1\n";
    }
}