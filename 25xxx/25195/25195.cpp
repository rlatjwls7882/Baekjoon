#include<bits/stdc++.h>
using namespace std;

vector<vector<int>> connect(100000);
bool chk[100000] = {false, };

bool dfs(int cur) {
    if(chk[cur]) return true;
    for(int next:connect[cur]) {
        if(!dfs(next)) return false;
    }
    if(connect[cur].size()) return true;
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    while(M-->0) {
        int u, v; cin >> u >> v;
        connect[u-1].push_back(v-1);
    }

    int S; cin >> S;
    while(S-->0) {
        int s; cin >> s;
        chk[s-1]=true;
    }

    if(dfs(0)) cout << "Yes";
    else cout << "yes";
}