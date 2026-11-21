#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
int dp[1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; string s; cin >> N >> s;
    fill(dp+1, dp+N, INF);

    for(int i=0;i<N;i++) {
        for(int j=i+1;j<N;j++) {
            if(s[i]=='B' && s[j]=='O' || s[i]=='O' && s[j]=='J' || s[i]=='J' && s[j]=='B') {
                dp[j] = min(dp[j], dp[i]+(j-i)*(j-i));
            }
        }
    }
    if(dp[N-1]==INF) cout << -1;
    else cout << dp[N-1];
}