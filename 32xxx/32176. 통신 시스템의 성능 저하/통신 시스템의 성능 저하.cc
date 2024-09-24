#include<bits/stdc++.h>
using namespace std;

struct Pos {
    int x, y, dist;
};

Pos start;
int n, m, k1, k2;
int totalDist, maxForDay, maxForNight;
vector<Pos> pos;

void dfs(int depth, int end, int start, bool isDay, int P, vector<int> connList) {
    if(depth==end) {
        if(isDay) {
            int x1 = INT_MAX, x2=INT_MIN, y1=INT_MAX, y2=INT_MIN;
            for(int i=0;i<pos.size();i++) {
                bool chk=true;
                for(int j=0;j<connList.size();j++) {
                    if(i==connList[j]) chk=false;
                }
                if(!chk) continue;
                x1 = min(x1, pos[i].x);
                x2 = max(x2, pos[i].x);
                y1 = min(y1, pos[i].y);
                y2 = max(y2, pos[i].y);
            }
            int U = (x2-x1+1)*(y2-y1+1);
            maxForDay = max(maxForDay, (totalDist-P)-U);
        } else {
            int x1 = INT_MAX, x2=INT_MIN, y1=INT_MAX, y2=INT_MIN;
            for(int i:connList) {
                x1 = min(x1, pos[i].x);
                x2 = max(x2, pos[i].x);
                y1 = min(y1, pos[i].y);
                y2 = max(y2, pos[i].y);
            }
            int U = (x2-x1+1)*(y2-y1+1);
            maxForNight = max(maxForNight, P-U);
        }
        return;
    }
    for(int i=start;i<pos.size();i++) {
        connList.push_back(i);
        dfs(depth+1, end, i+1, isDay, P+pos[i].dist, connList);
        connList.pop_back();
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n >> m >> k1 >> k2;
    string s[n];
    for(int i=0;i<n;i++) cin >> s[i];

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(s[i][j]=='B') start = {i, j};
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(s[i][j]=='N') {
                pos.push_back({i, j, abs(i-start.x)+abs(j-start.y)});
                totalDist += pos.back().dist;
            }
        }
    }

    dfs(0, m-k1, 0, true, 0, {});
    dfs(0, k2, 0, false, 0, {});
    cout << maxForDay << '\n' << maxForNight;
}