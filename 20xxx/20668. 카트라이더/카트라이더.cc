#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 10'001;
const ll w = 11*10*9*8*7*6*5*4*3*2;


struct element {
    ll e, l, k;
};

vector<vector<element>> conn(MAX);
ll minDist[MAX][11];
bool inQueue[MAX][11];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int s, e, l, k; cin >> s >> e >> l >> k;
        conn[s].push_back({e, l*w, k});
        conn[e].push_back({s, l*w, k});
    }

    fill(&minDist[0][0], &minDist[MAX-1][11], LONG_LONG_MAX);
    queue<pair<int, int>> q; q.push({1, 1});
    minDist[1][1]=0;
    while(!q.empty()) {
        auto [cur, speed] = q.front(); q.pop();
        inQueue[cur][speed]=false;
        for(auto& [next, l, k]:conn[cur]) {
            for(int dx=-1;dx<=1;dx++) {
                int nextSpeed = speed+dx;
                if(nextSpeed<1 || nextSpeed>k) continue;

                ll nextDist = minDist[cur][speed] + l/nextSpeed;
                if(minDist[next][nextSpeed]>nextDist) {
                    minDist[next][nextSpeed] = nextDist;
                    if(!inQueue[next][nextSpeed]) q.push({next, nextSpeed});
                    inQueue[next][nextSpeed]=true;
                }
            }
        }
    }
    cout << setprecision(9) << fixed << *min_element(&minDist[n][0], &minDist[n][11])/(long double)w;
}