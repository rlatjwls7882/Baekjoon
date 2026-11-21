#include<bits/stdc++.h>
#define MOD 1000000007
using namespace std;
typedef long long ll;

ll pow(ll A, ll N) {
    if(N==1) return A;
    ll tmp = pow(A, N/2);
    if(N%2==0) return tmp*tmp%MOD;
    return tmp*tmp%MOD*A%MOD;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll A, X; cin >> A >> X; A%=MOD;
    cout << pow(A, X);
}