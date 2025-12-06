#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll T; cin >> T;
    while(T--) {
        ll n, s, t; cin >> n >> s >> t;

        ll res=0;
        while(n) {
            if(n%2==0) {
                if(t<n/2 || s*(n/2)>=t) res+=t;
                else res+=s*(n/2);
                n>>=1;
            } else {
                n--;
                res+=s;
            }
        }
        cout << res << '\n';
    }
}