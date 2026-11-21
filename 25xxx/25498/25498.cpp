#include<bits/stdc++.h>
using namespace std;

string s;
int len=1;
char res[500000];
bool visited[500000];
vector<vector<pair<char, int>>> conn(500000);

void dfs(int cur, int depth) {
    res[depth]=s[cur];
    visited[cur]=true;
    for(auto next:conn[cur]) {
        if(!visited[next.second]) {
            if((depth+1>=len || res[depth+1]<next.first)) {
                len = depth+2;
                dfs(next.second, depth+1);
            } else if(res[depth+1]==next.first) {
                dfs(next.second, depth+1);
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n >> s;
    for(int i=0;i<n-1;i++) {
        int a, b; cin >> a >> b;
        conn[a-1].push_back({s[b-1], b-1});
        conn[b-1].push_back({s[a-1], a-1});
    }
    for(int i=0;i<n;i++) sort(conn[i].begin(), conn[i].end(), greater<pair<char, int>>());
    dfs(0, 0);
    for(int i=0;i<len;i++) cout << res[i];
}