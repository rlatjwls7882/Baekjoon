#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

struct HopcroftKarp { // O(E√V)
    int match=0;
    const int aSZ, bSZ;
    vector<int> a, b, level, work;
    vector<vector<int>> conn;

    HopcroftKarp(int _sz1, int _sz2):aSZ(_sz1), bSZ(_sz2) {
        level = vector<int>(aSZ);
        work = a = vector<int>(aSZ, -1);
        b = vector<int>(bSZ, -1);
        conn = vector<vector<int>>(aSZ);
    }

    void edge(int u, int v) {
        conn[u].push_back(v);
    }

    void bfs() {
        queue<int> q;
        for(int i=0;i<aSZ;i++) {
            if(a[i]==-1) {
                level[i]=0;
                q.push(i);
            } else {
                level[i]=-1;
            }
        }
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(b[next]!=-1 && level[b[next]]==-1) {
                    level[b[next]]=level[cur]+1;
                    q.push(b[next]);
                }
            }
        }
    }

    bool dfs(int cur) {
        for(int &i=work[cur];i<conn[cur].size();i++) {
            int next=conn[cur][i];
            if(b[next]==-1 || level[b[next]]==level[cur]+1 && dfs(b[next])) {
                b[next]=cur;
                a[cur]=next;
                return true;
            }
        }
        return false;
    }

    int res() {
        while(true) {
            bfs();
            int flow=0;
            fill(work.begin(), work.end(), 0);
            for(int i=0;i<aSZ;i++) flow+=a[i]==-1 && dfs(i);
            if(!flow) break;
            match+=flow;
        }
        return match;
    }

    vector<vector<int>> cover() {
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
        vector<vector<int>> ret(2);
        for(int i=0;i<aSZ;i++) if(!visA[i]) ret[0].push_back(i);
        for(int i=0;i<bSZ;i++) if(visB[i]) ret[1].push_back(i);
        return ret;
    }
};

int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, 1, -1};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    set<int> ban;
    for(int i=0;i<3;i++) {
        int a; cin >> a;
        ban.insert(a);
    }

    HopcroftKarp hk(n*n, n*n);
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            int cur = i*n+j;
            if(cur%2 || ban.count(cur+1)) continue;
            for(int k=0;k<4;k++) {
                int nx = i+dx[k];
                int ny = j+dy[k];
                int next = nx*n+ny;
                if(nx<0 || nx>=n || ny<0 || ny>=n || ban.count(next+1)) continue;
                hk.edge(cur, next);
            }
        }
    }
    if(hk.res()<(n*n-3)/2) return !(cout << "NIE");
    for(int i=0;i<n*n;i++) {
        if(hk.a[i]!=-1) cout << i+1 << ' ' << hk.a[i]+1 << '\n';
    }
}