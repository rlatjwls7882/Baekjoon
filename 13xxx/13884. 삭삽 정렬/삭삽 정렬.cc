#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int k, n; cin >> k >> n;

        vector<int> a(n);
        for(int i=0;i<n;i++) cin >> a[i];

        vector<int> b=a;
        sort(b.begin(), b.end());

        int idx=0;
        for(int i=0;i<n;i++) {
            if(a[i]==b[idx]) idx++;
        }
        cout << k << ' ' << n-idx << '\n';
    }
}