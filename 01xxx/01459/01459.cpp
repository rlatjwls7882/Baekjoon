#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll X, Y, W, S; cin >> X >> Y >> W >> S;

    ll t=0;
    if(W*2>S) {
        t += min(X, Y)*S;
        if(W>S) {
            t += abs(X-Y)*S;
            if(abs(X-Y)%2==1) t+=W-S;
        } else {
            t += abs(X-Y)*W;
        }
    } else {
        t += (X+Y)*W;
    }
    cout << t;
}