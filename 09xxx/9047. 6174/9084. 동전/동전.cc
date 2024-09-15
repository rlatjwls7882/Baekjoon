#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int T; cin >> T;

    while(T-->0) {
        int N; cin >> N;

        int coin[N];
        for(int i=0;i<N;i++) {
            cin >> coin[i];
        }
        int M; cin >> M;

        int dp[M+1] = {1, 0, };
        for(int i=0;i<N;i++) {
            for(int j=1;j<=M;j++) {
                if(j-coin[i]>=0) {
                    dp[j] += dp[j-coin[i]];
                }
            }
        }
        cout << dp[M] << endl;
    }
}