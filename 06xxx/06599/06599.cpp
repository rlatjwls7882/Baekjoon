#include<bits/stdc++.h>
using namespace std;

struct block {
    int x, y, h;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int tc=1;;tc++) {
        int n; cin >> n;
        if(!n) break;

        vector<block> blocks;
        for(int i=0;i<n;i++) {
            int x, y, z; cin >> x >> y >> z;
            blocks.push_back({x, y, z});
            blocks.push_back({x, z, y});
            blocks.push_back({y, z, x});
        }
        n *= 3;

        vector<int> inBound(n);
        vector<vector<int>> conn(n);

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(blocks[i].x>blocks[j].x && blocks[i].y>blocks[j].y || blocks[i].x>blocks[j].y && blocks[i].y>blocks[j].x) {
                    conn[i].push_back(j);
                    inBound[j]++;
                }
            }
        }

        queue<int> q;
        vector<long long> maxH(n);
        for(int i=0;i<n;i++) {
            if(inBound[i]==0) {
                q.push(i);
                maxH[i] = blocks[i].h;
            }
        }
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next : conn[cur]) {
                if(--inBound[next]==0) q.push(next);
                maxH[next] = max(maxH[next], maxH[cur]+blocks[next].h);
            }
        }
        cout << "Case " << tc << ": maximum height = " << *max_element(maxH.begin(), maxH.end()) << '\n';
    }
}