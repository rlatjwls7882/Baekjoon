#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        ll n, m; cin >> n >> m;
        ll cnt=0;
        while(n!=0) {
            cnt++;
            n/=2;
        }
        cout << cnt + m << endl;
    }
}