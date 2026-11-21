#include<bits/stdc++.h>
using namespace std;

int cost[200'000][2], a[200'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    memset(cost, -1, sizeof cost);

    // 중간에서 도착점으로
    cost[n-1][1]=0;
    for(int i=n-2;i>=0;i--) {
        if(a[i]!=0 && i+a[i]<n && cost[i+a[i]][1]!=-1) {
            cost[i][1] = cost[i+a[i]][1]+1;
        }
    }

    // 중간에서 왼쪽으로
    for(int i=0;i<n-1;i++) {
        if(a[i]!=0 && i-a[i]>=0 && cost[i-a[i]][1]!=-1) {
            cost[i][1] = max(cost[i][1], cost[i-a[i]][1]+1);
        }
    }

    // start에서 오른쪽으로
    int res=-1;
    cost[0][0]=0;
    for(int i=0;i<n;i++) {
        if(a[i]!=0 && cost[i][0]!=-1 && i+a[i]<n) cost[i+a[i]][0] = max(cost[i+a[i]][0], cost[i][0]+1);
        if(cost[i][0]!=-1 && cost[i][1]!=-1) res = max(res, cost[i][0]+cost[i][1]);
    }
    cout << res;
}