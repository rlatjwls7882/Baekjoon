#include<bits/stdc++.h>
using namespace std;

string s[20];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int r, c; cin >> r >> c;
    for(int i=0;i<r;i++) cin >> s[i];

    string res="zzzzzzzzzzzzzzzzzzzz";
    for(int i=0;i<r;i++) {
        string word="";
        for(int j=0;j<=c;j++) {
            if(j==c || s[i][j]=='#') {
                if(word.length()>1) res = min(res, word);
                word = "";
            } else {
                word += s[i][j];
            }
        }
    }
    for(int i=0;i<c;i++) {
        string word="";
        for(int j=0;j<=r;j++) {
            if(j==r || s[j][i]=='#') {
                if(word.length()>1) res = min(res, word);
                word = "";
            } else {
                word += s[j][i];
            }
        }
    }
    cout << res;
}