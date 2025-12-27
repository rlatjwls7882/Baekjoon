#include<bits/stdc++.h>
using namespace std;

int s[2001], maxScore[2001][1001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) cin >> s[i];
    int a, d; cin >> a >> d;

    for(int i=1;i<n+d;i++) {
        for(int j=0;j<=n;j++) {
            maxScore[i][j]=maxScore[i-1][j]+s[i];
            if(i-d>=0 && j) maxScore[i][j] = max(maxScore[i][j], maxScore[i-d][j-1]+a);
        }
    }
    for(int i=0;i<=n;i++) {
        if(maxScore[n+d-1][i]>=m) {
            cout << i << '\n';
            return 0;
        }
    }
    cout << -1;
}