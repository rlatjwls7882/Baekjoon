#include<bits/stdc++.h>
using namespace std;

// dp[l][r] : 왼쪽 끝과 오른쪽 끝이 각각 l, r 일때의 근우의 최대 점수
int arr[1000], dp[1000][1000];

int dfs(int l, int r, int depth) {
    if(l>r) return 0;
    if(dp[l][r]!=-1) return dp[l][r];

    int dl = dfs(l+1, r, depth+1);
    int dr = dfs(l, r-1, depth+1);
    if(depth%2==0) return dp[l][r] = max(dl+arr[l], dr+arr[r]); // 근우의 차례 : 두 점수 중 큰 것을 선택
    return dp[l][r] = min(dl, dr); // 명우의 차례 : 두 점수 중 큰 것을 선택 (근우는 작은 점수 획득)
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        for(int i=0;i<n;i++) cin >> arr[i];
        memset(dp, -1, sizeof dp);
        cout << dfs(0, n-1, 0) << '\n';
    }
}