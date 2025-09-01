#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, t; cin >> n >> t;
    int minT = INT_MAX;
    while(n--) {
        int s, i, c; cin >> s >> i >> c;
        for(int cnt=0;cnt<c;cnt++) {
            if(t<=s+i*cnt) minT = min(minT, s+i*cnt);
        }
    }
    cout << (minT==INT_MAX ? -1 : minT-t);
}