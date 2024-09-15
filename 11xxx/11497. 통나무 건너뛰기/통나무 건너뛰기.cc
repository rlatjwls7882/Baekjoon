#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int a[n];
        for(int i=0;i<n;i++) {
            cin >> a[i];
        }
        sort(a, a+n);

        vector<int> v;
        for(int i=0;i<n;i+=2) {
            v.push_back(a[i]);
        }
        for(int i=(n%2==1?n-2:n-1);i>=0;i-=2) {
            v.push_back(a[i]);
        }
        v.push_back(a[0]);

        int _max=0;
        for(int i=0;i<n;i++) {
            _max = max(_max, abs(v[i+1]-v[i]));
        }
        cout << _max << '\n';
    }
}