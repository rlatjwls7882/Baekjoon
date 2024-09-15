#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int x=0, y=0;
    int pos[N][2];
    for(int i=0;i<N;i++) {
        cin >> pos[i][0] >> pos[i][1];
        x += pos[i][0];
        y += pos[i][1];
    }

    double minDist=1000000;
    for(int i=0;i<N;i++) {
        minDist = min(minDist, sqrt(pow(x-pos[i][0], 2) + pow(y-pos[i][1], 2)));
    }
    cout << x << ' ' << y << '\n';
    cout.precision(2);
    cout << fixed << minDist;
}