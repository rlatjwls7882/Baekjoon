#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll a[200'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    ll sum=0;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        sum += a[i];
    }
    sum/=n;

    ll cnt=0;
    for(int i=0;i<n-1;i++) {
        cnt += abs(sum-a[i]);
        a[i+1] += a[i]-sum;
    }
    cout << cnt;
}