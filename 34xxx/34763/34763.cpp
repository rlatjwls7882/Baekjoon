#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n, k; cin >> n >> k;

        bool chk=false;
        for(long long i=0;i<=n;i++) {
            if((i+1)*(n-i)>=k) {
                if((i+1)*(n-i)==k) chk=true;
                break;
            }
        }
        cout << (chk?"YES\n":"NO\n");
    }
}