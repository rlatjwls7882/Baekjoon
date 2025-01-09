#include<bits/stdc++.h>
using namespace std;

int cnt[1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    set<pair<int, int>> p;
    p.insert({1, 0});
    p.insert({0, 1});
    cnt[0]=2;
    for(int i=1;i<=1000;i++) {
        for(int x=1;x<=i;x++) {
            int gcdVal = gcd(i, x);
            p.insert({i/gcdVal, x/gcdVal});
            p.insert({x/gcdVal, i/gcdVal});
        }
        cnt[i] = p.size();
    }

    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        cout << cnt[n] << '\n';
    }
}