#include<bits/stdc++.h>
using namespace std;

const int MAX = 501;
bool high[MAX][MAX];

bool chk(vector<pair<int, int>> &inDegree) {
    sort(inDegree.begin(), inDegree.end());
    vector<bool> chk(inDegree.size());
    for(int i=0;i<inDegree.size();i++) {
        if(chk[inDegree[i].first]) return false;
        chk[inDegree[i].first]=true;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        memset(high, 0, sizeof high);

        vector<int> rank(n);
        for(int i=0;i<n;i++) cin >> rank[i];
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                high[rank[i]-1][rank[j]-1]=true;
            }
        }

        int m; cin >> m;
        while(m--) {
            int a, b; cin >> a >> b;
            high[a-1][b-1] ^= true;
            high[b-1][a-1] ^= true;
        }

        vector<pair<int, int>> inDegree;
        for(int i=0;i<n;i++) inDegree.push_back({0, i+1});
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(high[i][j]) {
                    inDegree[j].first++;
                }
            }
        }

        if(chk(inDegree)) {
            for(auto e : inDegree) cout << e.second << ' ';
            cout << '\n';
        } else {
            cout << "IMPOSSIBLE\n";
        }
    }
}