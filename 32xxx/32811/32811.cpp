#include<bits/stdc++.h>
using namespace std;

vector<vector<int>> needs;
int vis[26], res;

bool chk(int i) {
    for(int e : needs[i]) {
        if(vis[e]) return false;
    }
    return true;
}

void back(int depth=0, int start=0) {
    res = max(res, depth);

    for(int i=start;i<needs.size();i++) {
        if(chk(i)) {
            for(int e : needs[i]) vis[e]++;
            back(depth+1, i+1);
            for(int e : needs[i]) vis[e]--;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int p, t; cin >> p >> t;
    while(t--) {
        string s; cin >> s;
        needs.push_back({});

        for(char ch : s) {
            if(vis[ch-'A'] || ch-'A'>=p) {
                needs.pop_back();
                break;
            }
            vis[ch-'A']=true;
            needs.back().push_back(ch-'A');
        }
        memset(vis, 0, sizeof vis);
    }
    back();
    cout << res;
}