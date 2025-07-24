#include<bits/stdc++.h>
using namespace std;

int preSum[2001][2001];

struct element {
    int a, b, c;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    // 좌표 압축
    vector<element> v(n);
    vector<int> vals;
    for(int i=0;i<n;i++) {
        cin >> v[i].a >> v[i].b >> v[i].c;
        vals.push_back(v[i].a);
        vals.push_back(v[i].b);
    }
    sort(vals.begin(), vals.end());
    vals.erase(unique(vals.begin(), vals.end()), vals.end());

    // 누적합 계산
    for(int i=0;i<n;i++) {
        int a = lower_bound(vals.begin(), vals.end(), v[i].a) - vals.begin() + 1;
        int b = lower_bound(vals.begin(), vals.end(), v[i].b) - vals.begin() + 1;
        preSum[a][b] += v[i].c;
    }
    for(int i=1;i<=2000;i++) {
        for(int j=1;j<=2000;j++) {
            preSum[i][j] += preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1];
        }
    }

    int minE = INT_MAX;
    for(int i=1;i<=2000;i++) {
        for(int j=1;j<=2000;j++) {
            int S1 = preSum[i][j];
            int S2 = preSum[2000][j] - preSum[i][j];
            int S3 = preSum[i][2000] - preSum[i][j];
            int S4 = preSum[2000][2000] - preSum[2000][j] - preSum[i][2000] + preSum[i][j];
            minE = min(minE, max({S1, S2, S3, S4}) - min({S1, S2, S3, S4}));
        }
    }
    cout << minE;
}