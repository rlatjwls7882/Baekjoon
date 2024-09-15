#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        ll n, k; cin >> n >> k;
        if(n==0 && k==0) break;
        k = min(k, n-k);

        ll res=1;
        for(int i=n;i>n-k;i--) {
            res = res*i/(n-i+1);
        }
        cout << res << '\n';
    }
}