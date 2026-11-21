#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    int dp[10001] = {0, };
    dp[0]=1;
    int last=0;

    while(true) {
        int N; cin >> N;
        if(cin.fail()) break;

        int length = (int)(log10(N))+1;
        for(int i=0;i<5-length;i++) {
            cout << ' ';
        }
        cout << N << " -> ";

        if(last<N) {
            for(int i=last+1;i<=N;i++) {
                dp[i] = dp[i-1]*i;
                while(dp[i]%10==0) {
                    dp[i]/=10;
                }
                dp[i] = dp[i]%100000;
            }
            last=N;
        }
        cout << dp[N]%10 << '\n';
    }
}