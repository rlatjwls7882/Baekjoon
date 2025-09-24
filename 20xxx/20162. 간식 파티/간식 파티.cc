#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int dp[MAX]; // 마지막으로 먹은 간식의 점수가 i인 최대 점수합

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    memset(dp, -1, sizeof dp);
    dp[0]=0;
    while(n--) {
        int score; cin >> score;
        for(int i=score-1;i>=0;i--) {
            if(dp[i]!=-1) dp[score] = max(dp[score], dp[i]+score);
        }
    }
    cout << *max_element(dp, dp+MAX);
}