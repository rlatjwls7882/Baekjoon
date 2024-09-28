#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int s[n];
    for(int i=0;i<n;i++) cin >> s[i];
    int t; cin >> t;

    sort(s, s+n);
    int cnt=0, idx=0;
    while(idx<n) {
        int cur = (s[idx]+t-1)/t*t;
        while(idx<n && cur>=s[idx]) idx++;
        cnt++;
    }
    cout << cnt;
}