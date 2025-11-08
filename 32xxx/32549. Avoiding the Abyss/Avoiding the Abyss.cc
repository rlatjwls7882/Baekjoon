#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0); cin.tie(0);
    int xs, ys, xe, ye, xp, yp; cin >> xs >> ys >> xe >> ye >> xp >> yp;
    cout << "3\n";
    if(xs<xp) {
        cout << "-1000000000 " << ys << '\n';
        if(ye>yp) cout << "-1000000000 1000000000\n" << xe << " 1000000000";
        else cout << "-1000000000 -1000000000\n" << xe << " -1000000000";
    } else {
        cout << "1000000000 " << ys << '\n';
        if(ye>yp) cout << "1000000000 1000000000\n" << xe << " 1000000000";
        else cout << "1000000000 -1000000000\n" << xe << " -1000000000";
    }
}