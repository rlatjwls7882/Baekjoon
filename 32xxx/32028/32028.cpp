#include<bits/stdc++.h>
#define INF 2100000000
using namespace std;

struct Node {
    int nodeNum, val, left, right, minVal, maxVal;

    bool operator<(const Node a) const {
        return this->val<a.val;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<vector<Node>> depth = vector<vector<Node>>(N+1);
    vector<Node> nodeList;
    for(int i=0;i<N;i++) {
        int A, H; cin >> A >> H;
        nodeList.push_back({i+1, A, -1, -1, -INF, INF});
        depth[H].push_back({i+1, A, -1, -1, -INF, INF});
    }

    if(depth[1].size()!=1) {
        cout << -1;
        return 0;
    }

    for(int i=2;i<=N;i++) {
        sort(depth[i].begin(), depth[i].end());
        int j=0, k=0;
        while(j<depth[i].size() && k<depth[i-1].size()) {
            while(k<depth[i-1].size()) {
                if(depth[i-1][k].left==-1 && depth[i-1][k].minVal<depth[i][j].val && depth[i][j].val<depth[i-1][k].val) {
                    nodeList[depth[i-1][k].nodeNum-1].left=depth[i][j].nodeNum;
                    depth[i-1][k].left=depth[i][j].nodeNum;
                    depth[i][j].minVal = depth[i-1][k].minVal;
                    depth[i][j].maxVal = depth[i-1][k].val;
                    j++;
                    break;
                }
                if(depth[i-1][k].right==-1 && depth[i-1][k].val<depth[i][j].val && depth[i][j].val<depth[i-1][k].maxVal) {
                    nodeList[depth[i-1][k].nodeNum-1].right=depth[i][j].nodeNum;
                    depth[i-1][k].right=depth[i][j].nodeNum;
                    depth[i][j].minVal = depth[i-1][k].val;
                    depth[i][j].maxVal = depth[i-1][k].maxVal;
                    j++;
                    break;
                }
                k++;
            }
        }
        if(j!=depth[i].size()) {
            cout << -1;
            return 0;
        }
    }

    for(int i=0;i<N;i++) {
        cout << nodeList[i].left << ' ' << nodeList[i].right << '\n';
    }
}