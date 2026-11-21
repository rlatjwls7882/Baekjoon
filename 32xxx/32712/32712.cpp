#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll a[200'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    for(int i=0;i<n;i++) cin >> a[i];

    ll res=0, sum=0, cnt=0;
    for(int i=0;i<n && i<k;i++, cnt++) {
        res = max(res, sum+a[i]*(k-cnt));
        sum += a[i];
    }
    sum=cnt=0;
    for(int i=n-1;i>=0 && cnt<k;i--, cnt++) {
        res = max(res, sum+a[i]*(k-cnt));
        sum += a[i];
    }
    cout << res;
}