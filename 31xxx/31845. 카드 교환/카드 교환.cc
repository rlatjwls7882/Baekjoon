#include<bits/stdc++.h>
using namespace std;

int a[1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> a[i];
    sort(a, a+n, greater<int>());

    int sum=0;
    for(int i=0;i<min((n+1)/2, m);i++) {
        if(a[i]<0) break;
        sum += a[i];
    }
    cout << sum;
}