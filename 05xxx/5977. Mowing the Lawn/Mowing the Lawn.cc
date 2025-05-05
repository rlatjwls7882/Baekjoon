#include<bits/stdc++.h>
using namespace std;

long long dp[100'001]; // dp[i] : i번 소에게 일을 시켰을 때의 최대 능력치

struct element {
    int pos;
    long long val;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;

    /** 
     * dp[i] = MAX(preSum[i] - preSum[j] + dp[j-1]) (max(1, i-k) <= j <= i-1) :
     * - j-1번 소까지의 최대 능력치 + j+1번 ~ i번 소까지 연속 선택했을 때의 능력치
     * 
     * -> dp[i] = preSum[i] + MAX(dp[j-1] - preSum[j])으로 변경
     * 덱트릭으로 MAX(dp[j-1] - preSum[j]) 찾기
     */
    long long preSum=0;
    deque<element> deq; deq.push_back({0, 0}); // 기본값 : {0, dp[0]-preSum[0]}
    for(int i=1;i<=n;i++) {
        long long cur; cin >> cur;
        preSum += cur;
        while(!deq.empty() && i-deq.front().pos>k) deq.pop_front();

        dp[i] = max(dp[i-1], preSum + deq.front().val);

        long long nextVal = dp[i-1]-preSum;
        while(!deq.empty() && deq.back().val <= nextVal) deq.pop_back();
        deq.push_back({i, nextVal});
    }
    cout << dp[n];
}