#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

struct HopcroftKarp { // O(EV^(1/2))
    const int aSZ, bSZ;
    vector<unsigned char> used;
    vector<int> a, b, level;
    vector<vector<int>> conn;

    HopcroftKarp(int _sz1, int _sz2):aSZ(_sz1), bSZ(_sz2) {
        used = vector<unsigned char>(aSZ);
        level = vector<int>(aSZ);
        a = vector<int>(aSZ, -1);
        b = vector<int>(bSZ, -1);
        conn = vector<vector<int>>(aSZ);
    }

    void edge(int u, int v) {
        conn[u].push_back(v);
    }

    void bfs() {
        queue<int> q;
        for(int i=0;i<aSZ;i++) {
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
                used[cur]=true;
                b[next]=cur;
                a[cur]=next;
                return true;
            }
        }
        return false;
    }

    int res() {
        int ret=0;
        while(true) {
            bfs();
            int flow=0;
            for(int i=0;i<aSZ;i++) flow+=!used[i] && dfs(i);
            if(!flow) break;
            ret+=flow;
        }
        return ret;
    }

    vector<int> cover() {
        auto visA = vector<unsigned char>(aSZ);
        auto visB = vector<unsigned char>(bSZ);

        queue<int> q;
        for(int i=0;i<aSZ;i++) {
            if(a[i]==-1) {
                q.push(i);
                visA[i]=true;
            }
        }
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(!visB[next] && b[next]!=-1 && !visA[b[next]]) {
                    visB[next]=true;
                    visA[b[next]]=true;
                    q.push(b[next]);
                }
            }
        }
        vector<int> ret;
        for(int i=0;i<aSZ;i++) if(visA[i] && !visB[i]) ret.push_back(i);
        return ret;
    }
};

int s[1000], d[1000], t[1000][1000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int tc; cin >> tc;
    while(tc--) {
        int n; cin >> n;
        for(int i=0;i<n;i++) cin >> s[i];
        for(int i=0;i<n;i++) cin >> d[i];
        for(int i=0;i<n;i++) for(int j=i;j<n;j++) cin >> t[i][j];

        HopcroftKarp hk(n, n);
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(s[i]+d[i]+t[i][j]<=s[j]) hk.edge(i, j);
                if(s[j]+d[j]+t[i][j]<=s[i]) hk.edge(j, i);
            }
        }
        cout << n-hk.res() << '\n';
        auto res = hk.cover();
        for(int e:res) cout << e+1 << ' ';
        cout << '\n';
    }
}