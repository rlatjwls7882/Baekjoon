#include<bits/stdc++.h>
using namespace std;

const int MOD = 9901;

int n, m;
/** 
 * dp[cur][visited] : 현재 cur번째 칸을 탐색 중이고(cur-1까지는 전부 채워짐), 방문한 배열이 visited일 때의 경우의 수
 * 방문한 배열은 자신의 칸부터 자신 아래 칸 전까지의 m칸의 방문을 기록함.
 */
int dp[14*14][1<<14];

int dfs(int cur, int visited) {
    if(cur == n*m && visited==0) return 1;
    if(cur >= n*m) return 0;
    if(dp[cur][visited]!=-1) return dp[cur][visited];

    if(visited&1) return dp[cur][visited] = dfs(cur+1, visited>>1); // 해당 칸이 이미 차있는 경우

    dp[cur][visited] = dfs(cur+1, visited>>1 | 1<<(m-1)); // 세로 도미노 채우기

    if(cur%m<m-1 && !(visited&2)) dp[cur][visited] += dfs(cur+2, visited>>2); // 가로 도미노 채우기

    dp[cur][visited] %= MOD;
    return dp[cur][visited];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    memset(dp, -1, sizeof dp);
    cout << dfs(0, 0);
}