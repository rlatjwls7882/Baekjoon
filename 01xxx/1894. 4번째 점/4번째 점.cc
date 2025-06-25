#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        double x1, x2, x3, x4, y1, y2, y3, y4; cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;
        if(cin.fail()) break;
        if(x1==x3 && y1==y3) swap(x1, x2), swap(y1, y2);
        else if(x2==x4 && y2==y4) swap(x3, x4), swap(y3, y4);
        else if(x1==x4 && y1==y4) swap(x1, x2), swap(y1, y2), swap(x3, x4), swap(y3, y4);

        double dx = x4-x3;
        double dy = y4-y3;
        cout << setprecision(3) << fixed << x1 + dx << ' ' << y1 + dy << '\n';
    }
}