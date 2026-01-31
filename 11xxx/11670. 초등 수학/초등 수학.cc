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

ll a[2500], b[2500];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    vector<ll> nums;
    for(int i=0;i<n;i++) {
        cin >> a[i] >> b[i];
        nums.push_back(a[i]+b[i]);
        nums.push_back(a[i]-b[i]);
        nums.push_back(a[i]*b[i]);
    }
    sort(nums.begin(), nums.end());
    nums.erase(unique(nums.begin(), nums.end()), nums.end());

    HopcroftKarp hk(n, nums.size());
    for(int i=0;i<n;i++) {
        hk.edge(i, lower_bound(nums.begin(), nums.end(), a[i]+b[i])-nums.begin());
        hk.edge(i, lower_bound(nums.begin(), nums.end(), a[i]-b[i])-nums.begin());
        hk.edge(i, lower_bound(nums.begin(), nums.end(), a[i]*b[i])-nums.begin());
    }
    if(hk.res()!=n) return !(cout << "impossible");

    for(int i=0;i<n;i++) {
        if(nums[hk.a[i]]==a[i]+b[i]) cout << a[i] << " + " << b[i] << " = " << nums[hk.a[i]] << '\n';
        else if(nums[hk.a[i]]==a[i]-b[i]) cout << a[i] << " - " << b[i] << " = " << nums[hk.a[i]] << '\n';
        else cout << a[i] << " * " << b[i] << " = " << nums[hk.a[i]] << '\n';
    }
}