#include<bits/stdc++.h>
using namespace std;

int k;
set<string> cur, res;

void back(string x, int depth=0, int start=0, string s="") {
    if(depth==k) {
        if(cur.count(s)) res.insert(s);
        cur.insert(s);
        return;
    }
    for(int i=start;i<x.size();i++) back(x, depth+1, i+1, s+x[i]);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string x, y, z; cin >> x >> y >> z >> k;
    back(x); back(y); back(z);
    if(res.empty()) cout << -1;
    else for(string s:res) cout << s << '\n';
}