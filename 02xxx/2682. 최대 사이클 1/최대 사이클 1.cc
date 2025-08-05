#include<bits/stdc++.h>
using namespace std;

long long fact[21] = {1, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=1;i<=20;i++) fact[i] = fact[i-1]*i;

    int t; cin >> t;
    while(t--) {
        int n, k; cin >> n >> k;
        if(k==1) {
            cout << fact[n-1] << '\n';
        } else {
            long long sum=0;
            for(int i=2;i<=k;i++) {
                sum += (fact[k-2]/fact[i-2]/fact[k-i]) * fact[i-1] * fact[n-i];
            }
            cout << sum << '\n';
        }
    }
}