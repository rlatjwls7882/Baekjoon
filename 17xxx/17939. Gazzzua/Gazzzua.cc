#include<bits/stdc++.h>
using namespace std;

int a[100'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    int sum=0, cur=a[n-1];
    for(int i=n-2;i>=0;i--) {
        sum += max(0, cur-a[i]);
        cur = max(cur, a[i]);
    }
    cout << sum;
}