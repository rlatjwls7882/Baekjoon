#include<bits/stdc++.h>
using namespace std;

string s[100];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> s[i];

    int cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(j+2<m && s[i][j]=='F' && s[i][j+1]=='O' && s[i][j+2]=='X') cnt++;
            if(j-2>=0 && s[i][j]=='F' && s[i][j-1]=='O' && s[i][j-2]=='X') cnt++;
            if(i+2<n && s[i][j]=='F' && s[i+1][j]=='O' && s[i+2][j]=='X') cnt++;
            if(i-2>=0 && s[i][j]=='F' && s[i-1][j]=='O' && s[i-2][j]=='X') cnt++;

            if(i+2<n && j+2<m && s[i][j]=='F' && s[i+1][j+1]=='O' && s[i+2][j+2]=='X') cnt++;
            if(i+2<n && j-2>=0 && s[i][j]=='F' && s[i+1][j-1]=='O' && s[i+2][j-2]=='X') cnt++;
            if(i-2>=0 && j+2<m && s[i][j]=='F' && s[i-1][j+1]=='O' && s[i-2][j+2]=='X') cnt++;
            if(i-2>=0 && j-2>=0 && s[i][j]=='F' && s[i-1][j-1]=='O' && s[i-2][j-2]=='X') cnt++;
        }
    }
    cout << cnt;
}