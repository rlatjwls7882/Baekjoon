#include<bits/stdc++.h>
using namespace std;

bool chk[26];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int S; cin >> S; cin.ignore();
    vector<char> res;
    while(S-->0) {
        string s; getline(cin, s);
        for(char ch:s) {
            if(ch!=' ' && !chk[ch-'A']) {
                res.push_back(ch);
                chk[ch-'A']=true;
            }
        }
    }
    for(char e:res) cout << e;
}