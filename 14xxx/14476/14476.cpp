#include<bits/stdc++.h>
using namespace std;

int pre[1'000'002], suff[1'000'002], a[1'000'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> a[i];
    for(int i=1;i<=n;i++) {
        if(i==1) pre[i]=a[i];
        else pre[i] = gcd(pre[i-1], a[i]);
    }
    for(int i=n;i>=1;i--) {
        if(i==n) suff[i]=a[i];
        else suff[i] = gcd(suff[i+1], a[i]);
    }

    int res1=-1, res2;
    for(int i=1;i<=n;i++) {
        int gcdVal;
        if(i==1) gcdVal = suff[2];
        else if(i==n) gcdVal = pre[n-1];
        else gcdVal = gcd(pre[i-1], suff[i+1]);
        if(a[i]%gcdVal && res1<gcdVal) {
            res1=gcdVal;
            res2=a[i];
        }
    }
    if(res1==-1) cout << -1;
    else cout << res1 << ' ' << res2;
}