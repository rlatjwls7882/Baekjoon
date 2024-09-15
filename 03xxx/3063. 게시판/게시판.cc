#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    
    while(T-->0) {
        int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
        int x3, y3, x4, y4; cin >> x3 >> y3 >> x4 >> y4;

        int left = max(x1, x3);
        int right = min(x2, x4);
        int down = max(y1, y3);
        int up = min(y2, y4);

        int minus=0;
        if(right-left>0 && up-down>0) minus = (right-left)*(up-down);
        cout << (x2-x1)*(y2-y1)-minus << '\n';
    }
}