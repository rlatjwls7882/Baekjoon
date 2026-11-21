#include<bits/stdc++.h>
using namespace std;

double calcDist(int a[2], int b[2]) {
    return sqrt(pow(a[0]-b[0], 2)+pow(a[1]-b[1], 2));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int pos[3][2];
    for(int i=0;i<3;i++) {
        cin >> pos[i][0] >> pos[i][1];
    }

    if((pos[1][0]-pos[0][0])*(pos[2][1]-pos[0][1])==(pos[1][1]-pos[0][1])*(pos[2][0]-pos[0][0])) {
        cout << -1;
        return 0;
    }

    vector<double> d;
    for(int i=0;i<3;i++) {
        for(int j=i+1;j<3;j++) {
            d.push_back(calcDist(pos[i], pos[j]));
        }
    }

    double MAX=-1, MIN=99999;
    for(int i=0;i<3;i++) {
        for(int j=i+1;j<3;j++) {
            double cur = (d[i]+d[j])*2;
            MAX = max(MAX, cur);
            MIN = min(MIN, cur);
        }
    }
    cout << fixed;
    cout.precision(9);
    cout << MAX-MIN;
}