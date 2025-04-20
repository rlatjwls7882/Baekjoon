#include<bits/stdc++.h>
using namespace std;

const int S1=0, S2=1; // S1 : 1번 경찰차의 위치, S2 : 2번 경찰차의 위치
int n, w;
int pos[1002][2]; // 순찰할 위치
int dp[1002][1002]; // dp[a][b] : 1번 순찰차는 a 위치에, 2번 순찰차는 b 위치에 있을 때의 최소 비용
int trace[1002][1002]; // 역추적

int getCost(int cur, int next) { // 이동 비용
    return abs(pos[cur][0]-pos[next][0]) + abs(pos[cur][1]-pos[next][1]);
}

int solve(int a, int b) {
    if(dp[a][b]!=-1) return dp[a][b];
    if(a==w+1 || b==w+1) return 0;

    int next = max(a, b)+1;

    // 1번 순찰차가 이동 (pos[a]에서 pos[next]로 이동)
    int nextCost1 = solve(next, b) + getCost(a, next);

    // 2번 순찰차가 이동 (pos[b]에서 pos[next]로 이동)
    int nextCost2 = solve(a, next) + getCost(b, next);

    if(nextCost1<nextCost2) {
        trace[a][b]=1;
        dp[a][b] = nextCost1;
    } else {
        trace[a][b]=2;
        dp[a][b] = nextCost2;
    }
    return dp[a][b];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> w;
    pos[S1][0]=pos[S1][1]=1;
    pos[S2][0]=pos[S2][1]=n;
    for(int i=2;i<w+2;i++) cin >> pos[i][0] >> pos[i][1];

    memset(dp, -1, sizeof dp);
    solve(S1, S2);

    cout << dp[S1][S2] << '\n'; // 최소비용

    // 역추적
    for(int a=S1, b=S2;a!=w+1 && b!=w+1;) {
        cout << trace[a][b] << '\n';
        if(trace[a][b]==1) a = max(a, b)+1;
        else b = max(a, b)+1;
    }
}