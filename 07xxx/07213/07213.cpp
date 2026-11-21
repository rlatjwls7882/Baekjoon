#include<bits/stdc++.h>
using namespace std;

int cnt[2][3], tmp[2][3];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<2;i++) for(int j=0;j<3;j++) cin >> cnt[i][j];

    int maxSum=0;
    memcpy(tmp, cnt, sizeof cnt);
    for(int i=0;i<3;i++) {
        int cur = min(tmp[0][(i+1)%3], tmp[1][i]);
        tmp[0][(i+1)%3]-=cur;
        tmp[1][i]-=cur;
        maxSum += cur;
    }
    for(int i=0;i<3;i++) maxSum -= min(tmp[0][i], tmp[1][(i+1)%3]);

    int minSum=0;
    for(int i=0;i<3;i++) {
        int cur = min(cnt[0][i], cnt[1][(i+1)%3]);
        cnt[0][i]-=cur;
        cnt[1][(i+1)%3]-=cur;
        minSum -= cur;
    }
    for(int i=0;i<3;i++) minSum += min(cnt[0][(i+1)%3], cnt[1][i]);
    cout << maxSum << '\n' << minSum;
}