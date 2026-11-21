#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    int minDist=INT_MAX, r, c;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            bool state; cin >> state;
            if(!state) {
                int dist = i + abs((m+1)/2-j);
                if(dist<minDist) {
                    minDist = dist;
                    r = i;
                    c = j;
                }
            }
        }
    }
    if(minDist==INT_MAX) cout << -1;
    else cout << r << ' ' << c;
}