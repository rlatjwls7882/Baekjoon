#include<bits/stdc++.h>
using namespace std;

int n, m;
int dp[14*14][1<<14];
// dp[cur][visited] : 현재 방문중인 노드 번호가 cur이고, 현 노드부터 오른쪽으로 m개의 노드의 방문 현황 조합이 visited일 때의 최대 점수

int score[6][6] = {
    {10, 8, 7, 5, 0, 1},
    {8, 6, 4, 3, 0, 1},
    {7, 4, 3, 2, 0, 1},
    {5, 3, 2, 2, 0, 1},
    {0, 0, 0, 0, 0, 0},
    {1, 1, 1, 1, 0, 0},
};

char arr[14][14];

int dfs(int cur, int visited) {
    if(cur==n*m && !visited) return 0;
    if(cur>=n*m) return INT_MIN;
    if(dp[cur][visited]!=-1) return dp[cur][visited];
    if(visited&1) return dp[cur][visited] = dfs(cur+1, visited>>1); // 현재 정점을 이미 방문한 경우

    dp[cur][visited] = dfs(cur+1, visited>>1); // 연결 안하는 경우

    if(cur/m<n-1) { // 맨 아랫줄이 아닌 경우
        dp[cur][visited] = max(dp[cur][visited], score[arr[cur/m][cur%m]-'A'][arr[cur/m+1][cur%m]-'A'] + dfs(cur+1, visited>>1 | 1<<(m-1))); // 세로로 그룹화
    }

    if(cur%m<m-1 && !(visited&2)) { // 맨 오른쪽 줄이 아닌 경우
        dp[cur][visited] = max(dp[cur][visited], score[arr[cur/m][cur%m]-'A'][arr[cur/m][cur%m+1]-'A'] + dfs(cur+2, visited>>2)); // 가로로 그룹화
    }

    return dp[cur][visited];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cin >> arr[i][j];
        }
    }
    memset(dp, -1, sizeof dp);
    cout << dfs(0, 0);
}