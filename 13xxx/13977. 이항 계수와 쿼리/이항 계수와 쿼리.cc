#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

ll fact[4000001];
const long long MOD = 1000000007;

ll expo_square(ll N, ll A) {
    ll ans=1;
    while(A>0) {
        if(A%2==1) {
            ans*=N;
            ans%=MOD;
        }
        N*=N;
        N%=MOD;
        A/=2;
    }
    return ans;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    fact[0]=fact[1]=1;
    for(int i=2;i<=4000000;i++) {
        fact[i] = fact[i-1]*i%MOD;
    }

    int M; cin >> M;
    while(M-->0) {
        ll N, K; cin >> N >> K;
        cout << fact[N]*expo_square(fact[K]*fact[N-K]%MOD, MOD-2)%MOD << '\n';
    }
}