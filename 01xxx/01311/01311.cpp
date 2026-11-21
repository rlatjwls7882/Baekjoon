#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int n, d[20][20], dp[20][1<<21];
/**
 * dp[i][last] : 이전에 last 조합의 일를 선택했고 추가로 i번째 사람이 일을 할 때의 최소 cost
 * 
 * n=4일 경우
 * 1 2 3 4 
 * 1 2 4 3
 * 여기서 1 2를 선택하는 경우가 겹쳐 메모이제이션으로 계산을 줄일 수 있다.
 */

int dfs(int cur, int visited) {
    if(cur==n) return 0;
    if(dp[cur][visited]!=-1) return dp[cur][visited];
    dp[cur][visited]=INF;

    for(int i=0;i<n;i++) {
        if(!(visited & (1<<i))) {
            // cur번 사람이 i번 물건을 새로 든다
            dp[cur][visited] = min(dp[cur][visited], dfs(cur+1, visited | (1<<i)) + d[cur][i]);
        }
    }
    return dp[cur][visited];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> d[i][j];
        }
    }
    memset(dp, -1, sizeof dp);
    cout << dfs(0, 0);
}