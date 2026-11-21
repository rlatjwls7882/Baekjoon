#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'000'000;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n, m; cin >> n >> m;
        int cost[n][n]; fill(&cost[0][0], &cost[n-1][n], MAX);
        for(int i=0;i<n;i++) cost[i][i]=0;

        // 간선 입력
        while(m-->0) {
            int a, b, c; cin >> a >> b >> c;
            cost[a-1][b-1]=cost[b-1][a-1]=c;
        }

        // 플로이드-와샬
        for(int m=0;m<n;m++) {
            for(int s=0;s<n;s++) {
                for(int e=0;e<n;e++) {
                    cost[s][e] = min(cost[s][e], cost[s][m]+cost[m][e]);
                }
            }
        }

        // 모임에 참가하는 친구들
        int k; cin >> k;
        int friends[k];
        for(int i=0;i<k;i++) cin >> friends[i];

        // 최소거리를 만족하는 지점 출력
        int idx=0, minCost=INT_MAX;
        for(int i=0;i<n;i++) {
            int curCost=0;
            for(int j=0;j<k;j++) curCost += cost[i][friends[j]-1];
            if(minCost>curCost) {
                minCost=curCost;
                idx=i+1;
            }
        }
        cout << idx << '\n';
    }
}