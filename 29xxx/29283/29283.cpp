#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll k; cin >> k;
    ll sum=0;
    for(int i=1;k>0;i++, k-=5) {
        sum += 30*i*min(ll(5), k);
    }
    cout << sum;
}