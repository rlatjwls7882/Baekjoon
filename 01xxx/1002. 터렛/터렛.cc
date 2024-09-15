#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int x1, y1, r1, x2, y2, r2; cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;
        double dist = sqrt(pow(x1-x2, 2)+pow(y1-y2, 2));
        if(x1==x2 && y1==y2) {
            if(r1==r2) {
                cout << "-1\n";
            } else {
                cout << "0\n";
            }
        } else if(dist==r1+r2) {
            cout << "1\n";
        } else if(dist+r2<r1 || dist+r1<r2) {
            cout << "0\n";
        } else if(dist+r2==r1 || dist+r1==r2) {
            cout << "1\n";
        } else if(dist<r1+r2) {
            cout << "2\n";
        } else {
            cout << "0\n";
        }
    }
}