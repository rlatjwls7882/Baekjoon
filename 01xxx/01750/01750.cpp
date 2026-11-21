#include <bits/stdc++.h>

using namespace std;

int gcd(int a, int b) {
    while(b!=0) {
        int tmp = a%b;
        a=b;
        b=tmp;
    }
    return a;
}

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    int dp[100001] = {0, };
    for(int i=1;i<=N;i++) {
        int nextDp[100001]; memcpy(&nextDp, &dp, sizeof(dp));
        int S; cin >> S;

        nextDp[S]++;
        for(int j=1;j<=100000;j++) {
            if(dp[j]>0) {
                int idx = gcd(j, S);
                nextDp[idx] = (dp[j]+nextDp[idx])%10000003;
            }
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }
    cout << dp[1];
}