#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int existIdx[10], dp[200'001];

ll gcd(ll a, ll b) {
    while(b) {
        ll tmp = a%b;
        a = b;
        b = tmp;
    }
    return a;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    s = "0"+s;

    ll sum=0;
    for(int i=1;i<s.length();i++) {
        int cur = s[i]-'0', idx=i;
        existIdx[cur] = i;
        while(idx) {
            int nextIdx=0;
            for(int j=cur+1;j<=9;j++) nextIdx = max(nextIdx, existIdx[j]);
            dp[i] += cur * (idx-nextIdx);
            cur = s[nextIdx]-'0';
            idx = nextIdx;
        }
        sum += dp[i];
    }

    ll total = s.length()*(s.length()-1)/2;
    ll gcdVal = gcd(sum, total);
    total /= gcdVal;
    sum /= gcdVal;

    if(sum/total) cout << sum/total << ' ';
    if(sum==0) cout << "0";
    else if(total!=1) cout << sum%total << '/' << total;
}