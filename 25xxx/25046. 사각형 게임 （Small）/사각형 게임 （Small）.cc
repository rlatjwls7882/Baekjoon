#include<bits/stdc++.h>
using namespace std;

int N;
long long maxSum=LONG_LONG_MIN;
int m[9][9];
int cnt[9][9] = {0, };
void back(int depth, int start) {
    long long curMaxSum=0;
    for(int i=0;i<N;i++) {
        long long selectScore=0, notSelectScore=0;
        for(int j=0;j<N;j++) {
            if(cnt[j][i]==1) notSelectScore += m[j][i];
            else selectScore += m[j][i];
        }
        curMaxSum += min(selectScore, notSelectScore);
    }
    maxSum = max(maxSum, curMaxSum);

    for(int i=start;i<N;i++) {
        for(int j=0;j<N;j++) {
            cnt[i][j]++;
        }
        back(depth+1, i+1);
        for(int j=0;j<N;j++) {
            cnt[i][j]--;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
        }
    }
    back(0, 0);
    cout << maxSum;
}