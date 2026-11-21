#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;
const int MOD = 1e9+7;

int dp[11][MAX];

void update(int d, int i, int v) {
    while(i<MAX) {
        dp[d][i] = (dp[d][i]+v)%MOD;
        i+=i&-i;
    }
}

int query(int d, int i) {
    int ret=0;
    while(i) {
        ret = (ret+dp[d][i])%MOD;
        i-=i&-i;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    int res=0;
    while(n--) {
        int a; cin >> a;
        for(int i=11;i>0;i--) {
            int ret = query(i-1, a-1);
            if(i==1) ret=1;
            if(i==11) res = (res+ret)%MOD;
            else update(i, a, ret);
        }
    }
    cout << res;
}