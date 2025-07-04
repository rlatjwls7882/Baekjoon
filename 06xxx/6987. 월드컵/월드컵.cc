#include<bits/stdc++.h>
using namespace std;

int score[6][3];

vector<pair<int, int>> pos;

bool dfs(int depth) {
    if(depth==15) {
        for(int i=0;i<6;i++) {
            for(int j=0;j<3;j++) {
                if(score[i][j]) return false;
            }
        }
        return true;
    }

    int x = pos[depth].first;
    int y = pos[depth].second;
    for(int i=0;i<3;i++) { // win - draw - lose
        score[x][i]--;
        score[y][2-i]--;
        if(dfs(depth+1)) return true;
        score[x][i]++;
        score[y][2-i]++;
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<6;i++) {
        for(int j=i+1;j<6;j++) {
            pos.push_back({i, j});
        }
    }
    for(int i=0;i<4;i++) {
        for(int j=0;j<6;j++) for(int k=0;k<3;k++) cin >> score[j][k];
        cout << dfs(0) << ' ';
    }
}