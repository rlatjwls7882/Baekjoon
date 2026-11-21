#include<bits/stdc++.h>
using namespace std;

bool used[26];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    for(char ch:s) used[ch-'A']=true;

    bool chk=true;
    for(int i=0;i<26;i++) {
        if(!used[i]) {
            cout << char(i+'A');
            chk=false;
        }
    }
    if(chk) cout << "Alphabet Soup!";
}