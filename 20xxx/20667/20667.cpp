#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;
    vector<set<pair<int, int>>> dp(501);
    dp[0].insert({0, 0});
    while(N-->0) {
        vector<set<pair<int, int>>> nextDp=dp;
        int cpu, memory, priority; cin >> cpu >> memory >> priority;
        for(int i=0;i<=500-priority;i++) {
            for(auto ch:dp[i]) {
                pair<int, int> next = {ch.first+cpu, ch.second+memory};
                vector<pair<int, int>> erasing;
                for(auto nextCh:nextDp[i+priority]) {
                    if(nextCh.first<=next.first && nextCh.second<=next.second) {
                        erasing.push_back(nextCh);
                    }
                }
                for(auto nextCh:erasing) {
                    nextDp[i+priority].erase(nextCh);
                }
                nextDp[i+priority].insert(next);
            }
        }
        dp=nextDp;
    }

    for(int i=0;i<=500;i++) {
        for(pair<int, int> ch:dp[i]) {
            if(ch.first>=M && ch.second>=K) {
                cout << i;
                return 0;
            }
        }
    }
    cout << -1;
}