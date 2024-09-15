#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

ll MOD = 1000000007;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string s; cin >> s;

    ll sum=0;
    ll _pow[s.size()+1] = {1, 0};
    for(int i=0;i<s.size();i++) {
        if(i!=0) {
            _pow[i] = _pow[i-1]*2%MOD;
        }
        if(s[i]=='O') {
            sum = (sum+_pow[i])%MOD;
        }
    }
    cout << sum;
}