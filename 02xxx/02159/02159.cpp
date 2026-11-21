#include<bits/stdc++.h>
using namespace std;

int moveX[5] = {0, -1, 1, 0, 0};
int moveY[5] = {0, 0, 0, 1, -1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int lastX, lastY; cin >> lastX >> lastY;
    long long dp[5] = {0, 1, 1, 1, 1};
    while(n-->0) {
        long long nextDp[5]; fill(nextDp, nextDp+5, 100000000000);
        int curX, curY; cin >> curX >> curY;
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                nextDp[j] = min(nextDp[j], dp[i]+abs(curX+moveX[j]-(lastX+moveX[i])) + abs(curY+moveY[j]-(lastY+moveY[i])));
            }
        }

        memcpy(&dp, &nextDp, sizeof(dp));
        lastX=curX;
        lastY=curY;
    }
    cout << min(min(min(min(dp[0], dp[1]), dp[2]), dp[3]), dp[4]);
}