#include<bits/stdc++.h>
using namespace std;

// dp[i] : 온도가 i일때의 최대 점수
int dp[25001], curDp[25001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, c, d; cin >> n >> m >> c >> d;
    while(n--) {
        int b; cin >> b;

        vector<list<pair<int, int>>> deq(c); // [i%c]<idx, val>
        for(int i=1;i<=min(d+1, m);i++) { // 초기값 넣기
            while(!deq[i%c].empty() && deq[i%c].back().second<dp[i]) deq[i%c].pop_back();
            deq[i%c].push_back({i, dp[i]});
        }
        for(int i=1;i<=m;i++) { // 덱트릭
            while(!deq[i%c].empty() && abs(i-deq[i%c].front().first)>d) deq[i%c].pop_front();
            curDp[i] = deq[i%c].front().second + m-abs(b-i);
            if(i+d+1<=m) {
                while(!deq[(i+d+1)%c].empty() && deq[(i+d+1)%c].back().second<dp[i+d+1]) deq[(i+d+1)%c].pop_back();
                deq[(i+d+1)%c].push_back({i+d+1, dp[i+d+1]});
            }
        }
        memcpy(dp, curDp, sizeof dp);
    }
    cout << *max_element(dp+1, dp+m+1);
}