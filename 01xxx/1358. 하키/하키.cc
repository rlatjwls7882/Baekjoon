#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int W, H, X, Y, P; cin >> W >> H >> X >> Y >> P;
    int rad = H/2;

    int cnt=0;
    while(P-->0) {
        int x, y; cin >> x >> y;
        if(x<X) {
            if(pow(X-x, 2)+pow(Y+rad-y, 2)<=rad*rad) {
                cnt++;
            }
        } else if(x<=X+W) {
            if(Y<=y && y<=Y+H) {
                cnt++;
            }
        } else {
            if(pow(X+W-x, 2)+pow(Y+rad-y, 2)<=rad*rad) {
                cnt++;
            }
        }
    }
    cout << cnt;
}