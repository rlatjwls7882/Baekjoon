#include<bits/stdc++.h>
using namespace std;

int m[50], p[50], r[50];
long long dp[100'001]; // dp[i] : i초까지 가능한 최대 점수

/** 
 * Mi-Ri*Pi + Mj-(Ri+Rj)*Pj > Mj-Rj*Pj + Mi-(Ri+Rj)*Pi
 * i번을 하고 j번을 하는 것이 j번을 하고 i번을 하는 것보다 효율적이려면 부등호를 만족해야한다.
 * 식을 정리하면
 * -Ri*Pj > -Rj*Pi
 */
struct problem {
    long long m, p, r;
    bool operator<(const problem j) const {
        return r*j.p < j.r*p;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, t; cin >> n >> t;
    for(int i=0;i<n;i++) cin >> m[i];
    for(int i=0;i<n;i++) cin >> p[i];
    for(int i=0;i<n;i++) cin >> r[i];

    vector<problem> problems;
    for(int i=0;i<n;i++) problems.push_back({m[i], p[i], r[i]});
    sort(problems.begin(), problems.end());

    long long maxScore=0;
    for(int i=0;i<n;i++) {
        for(int j=t-1;j>=0;j--) {
            int nextT = j+problems[i].r;
            if(nextT<=t) {
                dp[nextT] = max(dp[nextT], dp[j]+problems[i].m-nextT*problems[i].p);
                maxScore = max(maxScore, dp[nextT]);
            }
        }
    }
    cout << maxScore;
}