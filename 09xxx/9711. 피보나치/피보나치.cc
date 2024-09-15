#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    for(int i=1;i<=t;i++) {
        ll P, Q; cin >> P >> Q;

        ll dp[P+5] = {0, 1};
        for(int i=2;i<=P;i++) {
            dp[i] = (dp[i-1]+dp[i-2])%Q;
        }
        cout << "Case #" << i << ": " << dp[P]%Q << '\n';
    }
}