#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 101;

int minCost[MAX][MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    fill(&minCost[0][0], &minCost[MAX-1][MAX], INF);
    for(int i=1;i<=n;i++) minCost[i][i]=0;
    while(m--) {
        int a, b, c; cin >> a >> b >> c;
        minCost[a][b] = min(minCost[a][b], c);
    }

    for(int mid=1;mid<=n;mid++) {
        for(int start=1;start<=n;start++) {
            for(int end=1;end<=n;end++) {
                minCost[start][end] = min(minCost[start][end], minCost[start][mid]+minCost[mid][end]);
            }
        }
    }
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=n;j++) {
            if(minCost[i][j]==INF) cout << "0 ";
            else cout << minCost[i][j] << ' ';
        }
        cout << '\n';
    }
}