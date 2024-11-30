#include<bits/stdc++.h>
using namespace std;

int minCost = INT_MAX;
vector<pair<int, int>> regionPos;
bool visited[10];

void back(int depth, int x, int y, int curCost) {
    if(depth==regionPos.size()) {
        minCost = min(minCost, curCost);
        return;
    }

    for(int i=0;i<regionPos.size();i++) {
        if(!visited[i]) {
            visited[i]=true;
            back(depth+1, regionPos[i].first, regionPos[i].second, curCost + max(abs(x-regionPos[i].first), abs(y-regionPos[i].second)));
            visited[i]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int startX, startY;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            int cur; cin >> cur;
            if(cur==1) {
                if(!regionPos.empty() && (regionPos.back().first+regionPos.back().second)%2!=(i+j)%2) {
                    cout << "Shorei";
                    return 0;
                }
                regionPos.push_back({i, j});
            }
            else if(cur==2) startX=i, startY=j;
        }
    }
    if(!regionPos.empty() && (regionPos.back().first+regionPos.back().second)%2!=(startX+startY)%2) {
        cout << "Shorei";
        return 0;
    }
    back(0, startX, startY, 0);
    cout << "Undertaker\n" << minCost;
}