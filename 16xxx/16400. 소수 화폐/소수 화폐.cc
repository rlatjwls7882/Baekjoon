#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll MOD = 123'456'789;
const int MAX=40001;

ll dp[MAX];
bool notPrime[MAX] = {1, 1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=2;i*i<MAX;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<MAX;j+=i) {
                notPrime[j]=1;
            }
        }
    }

    ll n; cin >> n;
    dp[0]=1;
    for(int i=2;i<=n;i++) {
        if(!notPrime[i]) {
            for(int j=i;j<=n;j++) {
                dp[j] = (dp[j]+dp[j-i])%MOD;
            }
        }
    }
    cout << dp[n];
}