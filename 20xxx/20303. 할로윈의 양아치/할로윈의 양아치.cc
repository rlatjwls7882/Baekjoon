#include <bits/stdc++.h>

using namespace std;

int parent[30000];
int _size[30000];
int c[30000];

int find(int x) {
    if(parent[x]==x) {
        return x;
    } else {
        return (parent[x] = find(parent[x]));
    }
}

void _union(int x, int y) {
    x = find(x);
    y = find(y);

    if(x<y) {
        parent[y]=x;
        _size[x]+=_size[y];
        c[x]+=c[y];
    } else if(x>y) {
        parent[x]=y;
        _size[y]+=_size[x];
        c[y]+=c[x];
    }
}

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, M, K; cin >> N >> M >> K;

    for(int i=0;i<N;i++) {
        cin >> c[i];
        parent[i]=i;
        _size[i]=1;
    }

    while(M-->0) {
        int a, b; cin >> a >> b;
        _union(a-1, b-1);
    }

    vector<pair<int, int>> v;
    for(int i=0;i<N;i++) {
        if(i==parent[i]) {
            v.push_back(make_pair(_size[i], c[i]));
        }
    }

    int dp[v.size()+1][K];
    for(int i=0;i<K;i++) {
        dp[0][i]=0;
    }
    for(int i=0;i<=v.size();i++) {
        dp[i][0]=0;
    }

    for(int i=1;i<=v.size();i++) {
        for(int j=0;j<K;j++) {
            dp[i][j] = dp[i-1][j];
            if(j-v[i-1].first>=0) {
                dp[i][j] = max(dp[i][j], dp[i-1][j-v[i-1].first]+v[i-1].second);
            }
        }
    }
    cout << dp[v.size()][K-1];
}