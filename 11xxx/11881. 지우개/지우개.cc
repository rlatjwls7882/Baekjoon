#include <bits/stdc++.h>
using namespace std;

long long MOD = 1000000007;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    long long cnt[100001] = {0, };
    vector<long long> a;
    for(int i=0;i<n;i++) {
        long long tmp; cin >> tmp;
        if(++cnt[tmp]==1) a.push_back(tmp);
    }
    sort(a.begin(), a.end());

    long long dp[3] = {cnt[a[0]]*a[0]%MOD, 0, 0};
    for(int i=1;i<a.size();i++) {
        dp[2] = (dp[2]+dp[1]*cnt[a[i]]%MOD*a[i])%MOD;
        dp[1] = (dp[1]+dp[0]*cnt[a[i]]%MOD*a[i])%MOD;
        dp[0] = (dp[0]+cnt[a[i]]*a[i])%MOD;
    }
    cout << dp[2];
}