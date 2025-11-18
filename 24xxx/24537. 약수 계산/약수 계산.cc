#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'001;

int cnt[MAX], dp[MAX];

int solve(int k) {
    if(dp[k]) return dp[k];

    int gcdVal=-1;
    for(int i=k;i<MAX;i+=k) {
        if(cnt[i]) {
            dp[k] += cnt[i];
            if(gcdVal==-1) gcdVal=i;
            else gcdVal = gcd(gcdVal, i);
        }
    }
    if(gcdVal!=k) dp[k]=-1;
    return dp[k]; 
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int cur; cin >> cur;
        cnt[cur]++;
    }

    int q; cin >> q;
    while(q--) {
        int k; cin >> k;
        cout << solve(k) << '\n';
    }
}