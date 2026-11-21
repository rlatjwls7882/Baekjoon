#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    double h[n];
    for(int i=0;i<n;i++) cin >> h[i];
    int cnt[n] = {0, };

    for(int i=0;i<n;i++) {
        set<double> slope;
        for(int j=i+1;j<n;j++) {
            double curSlope = (h[j]-h[i])/(j-i);
            if(slope.lower_bound(curSlope)==slope.end()) {
                slope.insert(curSlope);
                cnt[i]++;
                cnt[j]++;
            }
        }
    }

    int maxCnt=0;
    for(int i=0;i<n;i++) maxCnt = max(maxCnt, cnt[i]);
    cout << maxCnt;
}