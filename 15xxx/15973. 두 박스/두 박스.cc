#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int x1, y1, x2, y2, x3, y3, x4, y4; cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;
    if(x2<x3 || x1>x4 || y2<y3 || y1>y4) cout << "NULL";
    else if(x1==x4 && y1==y4 || x1==x4 && y2==y3 || x2==x3 && y2==y3 || x2==x3 && y1==y4) cout << "POINT";
    else if((x1==x4 || x2==x3) && (y1<=y3 && y3<=y2 || y1<=y4 && y4<=y2 || y3<=y1 && y1<=y4 || y3<=y2 && y2<=y4) || (y1==y4 || y2==y3) && (x1<=x3 && x3<=x2 || x1<=x4 && x4<=x2 || x3<=x1 && x1<=x4 || x3<=x2 && x2<=x4)) cout << "LINE";
    else cout << "FACE";
}