#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll a[200'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n; cin >> n;

    ll sum=0;
    for(int i=0;i<2*n;i++) {
        cin >> a[i];
        sum += a[i];
    }
    sum/=n+1;

    sort(a, a+2*n);
    int l=0, r=2*n-1;
    vector<ll> preSum = {0};
    while(l<r) {
        if(a[l]+a[r]==sum) preSum.push_back(a[l]), l++, r--;
        else if(a[l]==sum) l++;
        else r--;
    }
    preSum.push_back(sum);

    for(int i=1;i<=n;i++) cout << preSum[i]-preSum[i-1] << ' ';
}