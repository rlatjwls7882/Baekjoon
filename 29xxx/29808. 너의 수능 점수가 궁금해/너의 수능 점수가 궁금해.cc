#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int S; cin >> S;

    set<pair<int, int>> res;
    if(S%4763==0) {
        S /= 4763;
        for(int i=0;i<=200;i++) {
            if(S-i*508>=0 && (S-i*508)%305==0 && (S-i*508)/305<=200) res.insert({i, (S-i*508)/305});
            if(S-i*508>=0 && (S-i*508)%212==0 && (S-i*508)/212<=200) res.insert({i, (S-i*508)/212});
            if(S-i*108>=0 && (S-i*108)%305==0 && (S-i*108)/305<=200) res.insert({i, (S-i*108)/305});
            if(S-i*108>=0 && (S-i*108)%212==0 && (S-i*108)/212<=200) res.insert({i, (S-i*108)/212});
        }
    }

    cout << res.size() << '\n';
    if(res.empty()) return 0;
    for(auto p:res) cout << p.first << ' ' << p.second << '\n';
}