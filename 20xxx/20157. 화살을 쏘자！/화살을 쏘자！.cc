#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;

    map<pair<int, int>, int> quadrant;
    while(N-->0) {
        int x, y; cin >> x >> y;
        int gcdVal = gcd(x, y);
        quadrant[{x/gcdVal, y/gcdVal}]++;
    }

    int maxCnt=0;
    for(auto e:quadrant) {
        maxCnt = max(maxCnt, e.second);
    }
    cout << maxCnt;
}