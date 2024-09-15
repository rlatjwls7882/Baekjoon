#include <bits/stdc++.h>
using namespace std;

int moveX[4] = {1, 0, -1, 0};
int moveY[4] = {0, -1, 0, 1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M, n; cin >> M >> n;

    int move=0, x=0, y=0;
    while(n-->0) {
        string s; int d; cin >> s >> d;
        if(s.compare("TURN")==0) {
            if(d==0) {
                move = (move+3)%4;
            } else {
                move = (move+1)%4;
            }
        } else {
            x += moveX[move]*d;
            y += moveY[move]*d;
            if(x<0 || y<0 || x>M || y>M) {
                cout << -1;
                return 0;
            }
        }
    }
    cout << x << " " << y;
}