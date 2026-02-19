#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define x first
#define y second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef vector<int> vi;
typedef vector<vi> vvi;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

struct HopcroftKarp { // O(E√V)
    int match=0;
    const int aSZ, bSZ;
    vector<int> a, b, level, work;
    vector<vector<int>> conn;

    HopcroftKarp(int aSz, int bSz):aSZ(aSz), bSZ(bSz), level(aSZ), work(aSz), a(aSz, -1), b(bSz, -1), conn(aSz) {}

    void edge(int u, int v) {
        conn[u].push_back(v);
    }

    void bfs() {
        queue<int> q;
        for(int i=0;i<aSZ;i++) {
            if(a[i]==-1) level[i]=0, q.push(i);
            else level[i]=-1;
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

    bool isUnique() {
        vector<int> inDegree(aSZ+bSZ);
        vector<vector<int>> dag(aSZ+bSZ);
        for(int cur=0;cur<aSZ;cur++) {
            for(int next:conn[cur]) {
                if(a[cur]==next) {
                    dag[aSZ+next].push_back(cur);
                    inDegree[cur]++;
                } else {
                    dag[cur].push_back(aSZ+next);
                    inDegree[aSZ+next]++;
                }
            }
        }

        queue<int> q;
        for(int i=0;i<aSZ+bSZ;i++) {
            if(!inDegree[i]) q.push(i);
        }
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:dag[cur]) {
                if(!(--inDegree[next])) q.push(next);
            }
        }
        for(int i=0;i<aSZ+bSZ;i++) {
            if(inDegree[i]) return false;
        }
        return true;
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

int h[500]; string b[500], c[500], d[500];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        for(int i=0;i<n;i++) cin >> h[i] >> b[i] >> c[i] >> d[i];

        HopcroftKarp hk(n, n);
        for(int i=0;i<n;i++) {
            if(b[i]=="M") {
                for(int j=0;j<n;j++) {
                    if(b[j]=="F" && abs(h[i]-h[j])<=40 && c[i]==c[j] && d[i]!=d[j]) {
                        hk.edge(i, j);
                    }
                }
            }
        }
        cout << n-hk.res() << '\n';
    }
}