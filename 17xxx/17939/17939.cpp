#include<bits/stdc++.h>
using namespace std;

int a[100'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    int sum=0, cur=0;
    for(int i=n-1;i>=0;i--) {
        cur = max(cur, a[i]);
        sum += cur-a[i];
    }
    cout << sum;
}