#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);
const int MAX = 20000;
const int S=0, E=MAX-1;

vector<vector<int>> conn(MAX);
int n, a[MAX], b[MAX], level[MAX];
bool used[MAX];

void bfs() {
    queue<int> q;
    for(int i=0;i<n;i++) {
        if(!used[i]) {
            level[i]=0;
            q.push(i);
        } else {
            level[i]=INF;
        }
    }
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(b[next]!=-1 && level[b[next]]==INF) {
                level[b[next]]=level[cur]+1;
                q.push(b[next]);
            }
        }
    }
}

bool dfs(int cur) {
    for(int next:conn[cur]) {
        if(b[next]==-1 || level[b[next]]==level[cur]+1 && dfs(b[next])) {
            b[next]=cur;
            a[cur]=next;
            return true;
        }
    }
    return false;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    while(true) {
        cin >> n;
        if(cin.fail()) break;

        for(int i=0;i<n;i++) conn[i].clear();
        memset(used, 0, sizeof used);
        for(int i=0;i<n;i++) {
            string s; cin >> s >> s;
            int k = stoi(s.substr(1, s.length()-2));
            while(k--) {
                int next; cin >> next;
                conn[i].push_back(next-n);
            }
        }

        memset(b, -1, sizeof b);
        int res=0;
        while(true) {
            bfs();
            int flow=0;
            for(int i=0;i<n;i++) flow += !used[i] && dfs(i);
            if(!flow) break;
            res+=flow;
        }
        cout << res << '\n';
    }
}