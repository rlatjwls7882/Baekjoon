#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n; cin >> n;

    int size[n];
    for(int i=0;i<n;i++) {
        cin >> size[i];
    }

    int dp[n] = {1, };
    int maxCnt=1;
    for(int i=1;i<n;i++) {
        int maxVal=0;
        for(int j=0;j<i;j++) {
            if(size[j]<size[i]) {
                maxVal = max(maxVal, dp[j]);
            }
        }
        dp[i] = maxVal+1;
        maxCnt = max(maxCnt, dp[i]);
    }
    cout << maxCnt;
}