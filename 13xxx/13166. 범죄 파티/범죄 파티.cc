#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);
const int MAX = 400'000;

bool used[MAX];
int n, a[MAX], b[MAX], level[MAX];
vector<vector<pair<int, int>>> conn(MAX);

void bfs(int k) {
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
        for(auto &[next, nk]:conn[cur]) {
            if(nk<=k && b[next]!=-1 && level[b[next]]==INF) {
                level[b[next]]=level[cur]+1;
                q.push(b[next]);
            }
        }
    }
}

int dfs(int cur, int k) {
    for(auto &[next, nk]:conn[cur]) {
        if(nk<=k && (b[next]==-1 || level[b[next]]==level[cur]+1 && dfs(b[next], k))) {
            used[cur]=true;
            b[next]=cur;
            a[cur]=next;
            return true;
        }
    }
    return false;
}

int res(int k) {
    int ret=0;
    memset(b, -1, sizeof b);
    memset(used, 0, sizeof used);
    while(true) {
        bfs(k);
        int flow=0;
        for(int i=0;i<n;i++) flow+=!used[i] && dfs(i, k);
        if(!flow) break;
        ret+=flow;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n;
    for(int i=0;i<n;i++) {
        for(int j=0;j<4;j+=2) {
            int b, k; cin >> b >> k;
            conn[i].push_back({b-1, k});
        }
    }

    int l=0, r=1'000'001;
    while(l<r) {
        int m = l+r>>1;
        if(res(m)==n) r=m;
        else l=m+1;
    }
    cout << (l==1'000'001 ? -1 : l);
}