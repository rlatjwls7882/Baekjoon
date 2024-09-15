#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

const ll MOD = 1000000007;

ll factDp[1000001] = {0, };
ll fact(long long N) {
    if(N<=1) return factDp[N]=1;
    if(factDp[N]==0) {
        factDp[N] = (fact(N-1)*N)%MOD;
    }
    return factDp[N];
}

ll squareRev(long long N, long long K) {
    if(K==0) return 1;
    if(K==1) return N;

    long long tmp = squareRev(N, K/2)%MOD;
    if(K%2==1) return ((tmp*tmp)%MOD*N)%MOD;
    else return (tmp*tmp)%MOD;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N, R; cin >> N >> R;
    cout << (fact(N)*squareRev(fact(R)*fact(N-R)%MOD, MOD-2))%MOD;
}