#include<bits/stdc++.h>
using namespace std;

int calcDist(int x1, int y1, int x2, int y2) {
    return (int)(pow(x1-x2, 2)+pow(y1-y2, 2));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;

        int cnt=0;
        int n; cin >> n;
        while(n-->0) {
            int cx, cy, r; cin >> cx >> cy >> r;
            
            int dist1 = calcDist(x1, y1, cx, cy);
            int dist2 = calcDist(x2, y2, cx, cy);

            if(!(r*r>dist1 && r*r>dist2)) {
                if(r*r>dist1) cnt++;
                if(r*r>dist2) cnt++;
            }
        }
        cout << cnt << '\n';
    }
}