#include<bits/stdc++.h>
using namespace std;

struct Point {
    long long x, y, c;

    bool operator<(const Point a) const {
        if(this->y*a.x==a.y*this->x) return this->c > a.c;
        return this->y*a.x < a.y*this->x;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<Point> v;
    while(N-->0) {
        long long xbl, ybl, xtr, ytr; cin >> xbl >> ybl >> xtr >> ytr;
        v.push_back({xtr, ybl, 1});
        v.push_back({xbl, ytr, -1});
    }
    sort(v.begin(), v.end());

    int maxCnt=0, cnt=0;
    for(Point p:v) {
        cnt += p.c;
        maxCnt = max(maxCnt, cnt);
    }
    cout << maxCnt;
}