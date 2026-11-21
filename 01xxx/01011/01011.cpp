#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;

    while(t-->0) {
        int x, y; cin >> x >> y;
        int dist = y-x;
        for(int i=1;;i++) {
            if(i>=dist) {
                cout << (i-1)*2+1 << '\n';
                break;
            } else if(i*2>=dist) {
                cout << i*2 << '\n';
                break;
            }
            dist -= i*2;
        }
    }
}