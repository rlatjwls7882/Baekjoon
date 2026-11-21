#include <bits/stdc++.h>

using namespace std;

int INF = 1000000000;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, H; cin >> N >> H;

    int dp[H+5001] = {0};
    for(int i=1;i<=H+5000;i++) {
        dp[i] = INF;
    }

    while(N-->0) {
        int P, C; cin >> P >> C;
        for(int i=P;i<=H+5000;i++) {
            dp[i] = min(dp[i], dp[i-P]+C);
        }
    }

    int _min = INF;
    for(int i=H;i<=H+5000;i++) {
        _min = min(_min, dp[i]);
    }
    cout << _min;
}