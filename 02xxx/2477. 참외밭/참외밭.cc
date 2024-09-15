#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {0, 0, -1, 1};
int moveY[4] = {-1, 1, 0, 0};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K; cin >> K;

    set<int> x, y;
    set<pair<int, int>> pos;
    int curX=0, curY=0;
    for(int i=1;i<=6;i++) {
        int a, b; cin >> a >> b;
        curX += moveX[a-1]*b;
        curY += moveY[a-1]*b;
        x.insert(curX);
        y.insert(curY);
        pos.insert({curX, curY});
    }

    int maxSize = (*--x.end()-*x.begin())*(*--y.end()-*y.begin()), holeSize;
    if(!pos.count({*x.begin(), *y.begin()})) holeSize = (*++x.begin()-*x.begin())*(*++y.begin()-*y.begin());
    else if(!pos.count({*--x.end(), *y.begin()})) holeSize = (*--x.end()-*++x.begin())*(*++y.begin()-*y.begin());
    else if(!pos.count({*x.begin(), *--y.end()})) holeSize = (*++x.begin()-*x.begin())*(*--y.end()-*++y.begin());
    else holeSize = (*--x.end()-*++x.begin())*(*--y.end()-*++y.begin());
    cout << (maxSize-holeSize)*K;
}