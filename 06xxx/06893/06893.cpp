#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;

    vector<int> score(n), worstRank(n, 1), lastRank(n);
    while(k-->0) {
        for(int i=0;i<n;i++) {
            int tmp; cin >> tmp;
            score[i] += tmp;
        }
        for(int i=0;i<n;i++) {
            int rank=1;
            for(int j=0;j<n;j++) if(score[j]>score[i]) rank++;
            worstRank[i] = max(worstRank[i], rank);
            lastRank[i] = rank;
        }
    }
    for(int i=0;i<n;i++) if(lastRank[i]==1) cout << "Yodeller " << i+1 << " is the TopYodeller: score " << score[i] << ", worst rank " << worstRank[i] << "\n";
}