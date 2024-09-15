#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int minCnt[3] = {0, }, maxCnt[3] = {0, };
    while(n-->0) {
        int m[3]; cin >> m[0] >> m[1] >> m[2];
        int nextMinCnt[3], nextMaxCnt[3];
        for(int i=0;i<3;i++) {
            nextMinCnt[i] = minCnt[i]+m[i];
            if(i-1>=0) nextMinCnt[i] = min(nextMinCnt[i], minCnt[i-1]+m[i]);
            if(i+1<3) nextMinCnt[i] = min(nextMinCnt[i], minCnt[i+1]+m[i]);
            nextMaxCnt[i] = maxCnt[i]+m[i];
            if(i-1>=0) nextMaxCnt[i] = max(nextMaxCnt[i], maxCnt[i-1]+m[i]);
            if(i+1<3) nextMaxCnt[i] = max(nextMaxCnt[i], maxCnt[i+1]+m[i]);
        }
        memcpy(&minCnt, &nextMinCnt, sizeof(minCnt));
        memcpy(&maxCnt, &nextMaxCnt, sizeof(maxCnt));
    }
    cout << max(max(maxCnt[0], maxCnt[1]), maxCnt[2]) << ' ' << min(min(minCnt[0], minCnt[1]), minCnt[2]);
}