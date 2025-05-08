#include<bits/stdc++.h>
using namespace std;

long long k[10];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<m;i++) cin >> k[i];

    // y1 - k*x1 == y2 - k*x2
    long long total=0;
    vector<map<long long, long long>> cnt(m);
    for(int i=0;i<n;i++) {
        long long x, y; cin >> x >> y;
        for(int j=0;j<m;j++) {
            total += cnt[j][y-k[j]*x];
            cnt[j][y-k[j]*x]++;
        }
    }
    cout << total*2;
}