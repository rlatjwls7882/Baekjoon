#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    ll ret=0;
    for(int i=0;i<n;i++) {
        ll sum=0;
        for(int j=0;j<m;j++) {
            ll num; cin >> num;
            sum += num;
        }
        ret ^= sum;
    }
    cout << (ret ? "august14" : "ainta");
}