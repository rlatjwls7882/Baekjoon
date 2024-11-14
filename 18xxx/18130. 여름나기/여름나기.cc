#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;
    long long idx=0, minCost=LONG_LONG_MAX;
    for(int i=1;i<=N;i++) {
        long long P, K, C; cin >> P >> K >> C;
        long long curCost = P+((Q-1)/K)*((Q-1)/K+1)/2*C;
        if(curCost<minCost) {
            minCost=curCost;
            idx=i;
        }
    }
    cout << idx << ' ' << minCost;
}