#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string s; cin >> s;

    int cnt=0;
    int dp[M] = {0, };
    for(int i=2;i<M;i++) {
        if(s[i]=='I') {
            if(dp[i-2]>0 && s[i-1]=='O') {
                dp[i] = dp[i-2]+1;
            } else if(s[i-2]=='I' && s[i-1]=='O') {
                dp[i]=1;
            }
            if(dp[i]>=N) {
                cnt++;
            }
        }
    }
    cout << cnt;
}