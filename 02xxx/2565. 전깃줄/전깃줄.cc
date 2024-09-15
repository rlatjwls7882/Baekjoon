#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<pair<int, int>> v;
    for(int i=0;i<N;i++) {
        int a, b; cin >> a >> b;
        v.push_back({a, b});
    }
    sort(v.begin(), v.end());

    int dp[N];
    int maxLen=0;
    for(int i=0;i<N;i++) {
        dp[i]=1;
        for(int j=i-1;j>=0;j--) {
            if(v[j].second<v[i].second) dp[i] = max(dp[i], dp[j]+1);
        }
        maxLen = max(maxLen, dp[i]);
    }
    cout << N-maxLen;
}