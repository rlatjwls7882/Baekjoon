#include<bits/stdc++.h>
using namespace std;

string s;
int table[5000];

int makeTable(string p) {
    int idx=0, ret=0;
    memset(table, 0, sizeof table);
    for(int i=1;i<p.length();i++) {
        while(idx && p[i]!=p[idx]) idx = table[idx-1];
        if(p[i]==p[idx]) {
            table[i] = ++idx;
            ret = max(ret, idx);
        }
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> s;
    int ret=0;
    for(int i=0;i<s.length();i++) {
        string p = s.substr(i, s.length()-i);
        ret = max(ret, makeTable(p));
    }
    cout << ret;
}