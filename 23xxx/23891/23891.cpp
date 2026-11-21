#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;
const long long MLINF = -0x3f3f3f3f3f3f3f3f;

long long dp[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    fill(dp, dp+MAX, MLINF);
    dp[0]=0;

    while(n--) {
        int s, p; cin >> s >> p;
        long long nextDp[MAX];
        fill(nextDp, nextDp+MAX, MLINF);
        for(int i=0;i<=m;i++) {
            nextDp[i] = max(nextDp[i], dp[i]-s);
            if(i+p<=m) nextDp[i+p] = max(nextDp[i+p], dp[i]);
            if(i+p+1<=m) nextDp[i+p+1] = max(nextDp[i+p+1], dp[i]+s);
        }
        memcpy(dp, nextDp, sizeof dp);
    }
    long long maxScore = *(max_element(dp, dp+MAX));
    cout << (maxScore>0 ? "W" : maxScore==0 ? "D" : "L");
}