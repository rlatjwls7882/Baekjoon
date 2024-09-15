#include<bits/stdc++.h>
using namespace std;

bool comp(vector<int> a, vector<int> b) {
    return a[0]<b[0];
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<vector<int>> v = vector<vector<int>>(N);
    for(int i=0;i<N;i++) {
        for(int j=0;j<3;j++) {
            int tmp; cin >> tmp;
            v[i].push_back(tmp);
        }
    }
    sort(v.begin(), v.end(), comp);

    int maxSize = v[0][2];
    int dp[N] = {v[0][2], };
    for(int i=1;i<N;i++) {
        dp[i]=v[i][2];
        for(int j=i-1;j>=0;j--) {
            if(v[j][1]<=v[i][0]) {
                dp[i] = max(dp[i], dp[j]+v[i][2]);
            }
        }
        maxSize = max(maxSize, dp[i]);
    }
    cout << maxSize;
}