#include<bits/stdc++.h>
using namespace std;

bool conn[26][26];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n-->0) {
        char u, v; string tmp; cin >> u >> tmp >> v;
        conn[u-'a'][v-'a']=true;
    }

    for(int m=0;m<26;m++) {
        for(int s=0;s<26;s++) {
            for(int e=0;e<26;e++) {
                if(conn[s][m] && conn[m][e]) {
                    conn[s][e] = true;
                }
            }
        }
    }

    int m; cin >> m;
    while(m-->0) {
        char u, v; string tmp; cin >> u >> tmp >> v;
        if(conn[u-'a'][v-'a']) cout << "T\n";
        else cout << "F\n";
    }
}