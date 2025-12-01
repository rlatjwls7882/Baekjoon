#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'000;

vector<int> dist2Cnt(MAX);
vector<vector<int>> dist1(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        dist1[u-1].push_back(v-1);
        dist1[v-1].push_back(u-1);
    }

    for(int i=0;i<n;i++) {
        for(int e:dist1[i]) {
            dist2Cnt[i] += dist1[e].size()-1;
        }
    }

    long long cnt = (n-1)*2;
    for(int i=0;i<n;i++) {
        if(dist2Cnt[i]==1) {
            for(int e1:dist1[i]) {
                for(int e2:dist1[e1]) {
                    if(e2!=i) {
                        cnt += dist2Cnt[e2];
                        break;
                    }
                }
            }
        } else {
            for(int e:dist1[i]) {
                if(dist2Cnt[i]==dist1[e].size()-1) {
                    cnt += dist2Cnt[i];
                    break;
                }
            }
        }
    }
    cout << cnt;
}