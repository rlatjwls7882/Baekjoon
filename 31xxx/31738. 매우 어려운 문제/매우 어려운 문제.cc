#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll N, M; cin >> N >> M;

    if(N>=M) {
        cout << 0;
    } else {
        ll mul=1;
        for(ll i=2;i<=N;i++) {
            mul = mul*i%M;
        }
        cout << mul;
    }
}