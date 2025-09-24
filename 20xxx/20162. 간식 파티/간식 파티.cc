#include<bits/stdc++.h>
using namespace std;

int a[1000], dp[1000]; // dp[i] : i까지의 최대 MSIS

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        dp[i] = a[i];

        for(int j=0;j<i;j++) {
            if(a[j]<a[i]) {
                dp[i] = max(dp[i], dp[j]+a[i]);
            }
        }
    }
    cout << *max_element(dp, dp+n);
}