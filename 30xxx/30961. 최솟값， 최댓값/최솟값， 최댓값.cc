#include<bits/stdc++.h>
using namespace std;

long long a[1'000'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    sort(a, a+n);

    long long res=0;
    for(int i=0;i<n-1;i++) res ^= a[i]*a[i+1];
    for(int i=0;i<n;i++) res ^= a[i]*a[i];
    cout << res;
}