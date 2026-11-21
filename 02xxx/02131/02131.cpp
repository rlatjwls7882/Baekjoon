#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {-1, 0, 1, 0};
int moveY[4] = {0, 1, 0, -1};

struct Pos {
    int x, y;
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N; cin.ignore();
    vector<Pos> scanPos;

    int x=0, y=0, move=0;
    scanPos.push_back({0, 0});
    while(N-->0) {
        string s; getline(cin, s);
        if(s[0]=='T') {
            if(s[5]=='L') move = (move+3)%4;
            else move = (move+1)%4;
        } else if(s[0]=='F') {
            x += moveX[move];
            y += moveY[move];
        } else {
            scanPos.push_back({x+moveX[move], y+moveY[move]});
        }
    }

    vector<vector<int>> dp(scanPos.size(), vector<int>(4, 1000000000));
    dp[0][0] = 0;

    for(int i=1;i<scanPos.size();i++) {
        for(int j=0;j<4;j++) {
            for(int k=0;k<4;k++) {
                if(i==1) dp[i][k] = min(dp[i][k], dp[i-1][j]+min(abs(scanPos[i].x+moveX[k]-scanPos[i-1].x), 1)+min(abs(scanPos[i].y+moveY[k]-scanPos[i-1].y), 1)+1);
                else dp[i][k] = min(dp[i][k], dp[i-1][j]+min(abs(scanPos[i].x+moveX[k]-(scanPos[i-1].x+moveX[j])), 1)+min(abs(scanPos[i].y+moveY[k]-(scanPos[i-1].y+moveY[j])), 1)+1);
            }
        }
    }
    cout << min(min(min(dp[scanPos.size()-1][0], dp[scanPos.size()-1][1]), dp[scanPos.size()-1][2]), dp[scanPos.size()-1][3]);
}