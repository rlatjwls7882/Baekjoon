#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll MOD = 1e9+7;

ll cnt[3]; // OCK, CK, K의 등장 횟수

ll expo_pow(ll a, ll b) {
    if(b==0) return 1;
    ll tmp = expo_pow(a, b/2);
    if(b%2) return tmp*tmp%MOD*a%MOD;
    return tmp*tmp%MOD;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;

    ll total=0;
    for(int i=n-1;i>=0;i--) {
        if(s[i]=='K') cnt[2] = (cnt[2]+1)%MOD;
        else if(s[i]=='C') cnt[1] = (cnt[1]+cnt[2])%MOD;
        else if(s[i]=='O') cnt[0] = (cnt[0]+cnt[1])%MOD;
        else if(s[i]=='R') total = (total+expo_pow(2, i)*cnt[0])%MOD;
    }
    cout << total;
}