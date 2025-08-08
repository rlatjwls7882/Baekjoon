#include<bits/stdc++.h>
using namespace std;

typedef pair<int, int> pi;

int n, m, h, maxCnt;
int arr[10][10];
bool visited[10];
vector<pi> milk;
pi start;

int dist(int x1, int y1, int x2, int y2) {
    return abs(x1-x2) + abs(y1-y2);
}

void back(int depth, int hp, int x, int y) {
    if(dist(x, y, start.first, start.second)<=hp) {
        maxCnt = max(maxCnt, depth);
    }
    for(int i=0;i<milk.size();i++) {
        int cost = dist(x, y, milk[i].first, milk[i].second);
        if(!visited[i] && hp>=cost) {
            visited[i]=true;
            back(depth+1, hp-cost+h, milk[i].first, milk[i].second);
            visited[i]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m >> h;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> arr[i][j];
            if(arr[i][j]==2) milk.push_back({i, j});
            else if(arr[i][j]==1) start = {i, j};
        }
    }
    back(0, m, start.first, start.second);
    cout << maxCnt;
}