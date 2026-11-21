#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int l, n; cin >> l >> n;
        int minTime=0, maxTime=0;
        for(int i=0;i<n;i++) {
            int pos; cin >> pos;
            minTime = max(minTime, min(pos, l-pos));
            maxTime = max(maxTime, max(pos, l-pos));
        }
        cout << minTime << ' ' << maxTime << '\n';
    }
}