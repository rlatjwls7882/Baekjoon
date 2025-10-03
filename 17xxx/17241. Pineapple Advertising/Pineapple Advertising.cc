#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

bool visited[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, q; cin >> n >> m >> q;
    while(m--) {
        int a, b; cin >> a >> b;
        conn[a].push_back(b);
        conn[b].push_back(a);
    }

    while(q--) {
        int cur; cin >> cur;

        int cnt = !visited[cur];
        visited[cur]=true;
        for(int next:conn[cur]) {
            if(!visited[next]) {
                cnt++;
                visited[next]=true;
            }
        }
        conn[cur].clear();
        cout << cnt << '\n';
    }
}