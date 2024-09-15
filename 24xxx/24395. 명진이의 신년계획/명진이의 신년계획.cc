#include<bits/stdc++.h>
using namespace std;

int dp[51][51];

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int R[M], B[M], D[M];
    for(int i=0;i<M;i++) {
        cin >> R[i] >> B[i] >> D[i];
    }
    for(int i=0;i<=50;i++) {
        for(int j=0;j<=50;j++) {
            dp[i][j]=-1;
        }
    }
    dp[0][0]=0;

    for(int i=0;i<M;i++) {
        int nextDp[51][51];
        for(int j=0;j<=50;j++) {
            for(int k=0;k<=50;k++) {
                nextDp[j][k]=dp[j][k];
            }
        }
        for(int j=0;j<=50-R[i];j++) {
            for(int k=0;k<=50-B[i];k++) {
                if(dp[j][k]>=0) {
                    nextDp[j+R[i]][k+B[i]] = max(nextDp[j+R[i]][k+B[i]], dp[j][k]+D[i]);
                }
            }
        }
        for(int j=0;j<=50;j++) {
            for(int k=0;k<=50;k++) {
                dp[j][k]=nextDp[j][k];
            }
        }
    }

    vector<pair<int, int>> v;
    for(int i=1;i<=N;i++) {
        int Ri, Bi; cin >> Ri >> Bi;
        v.push_back({i, max(dp[Ri][Bi], 0)});
    }
    sort(v.begin(), v.end(), [](pair<int, int> a, pair<int, int> b) {
        if(a.second==b.second) return a.first < b.first;
        return a.second < b.second;
    });
    for(auto res:v) {
        cout << res.first << ' ' << res.second << '\n';
    }
}