#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int s, k; cin >> s >> k;
        int res=0;
        if(k%2) {
            if(s%2) res=1;
        } else {
            int cnt = s%(k+1);
            if(cnt==k) res = k;
            else res = cnt%2;
        }
        cout << res << '\n';
    }
}