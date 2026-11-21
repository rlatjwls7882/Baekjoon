#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

int n, a, b;
bool notSosu[MAX] = {true, true};
int dp[MAX], grid[2][MAX];

int score(int n) {
    return notSosu[n] ? b : a;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=2;i*i<MAX;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<MAX;j+=i) notSosu[j]=true;
        }
    }

    cin >> n >> a >> b;
    for(int i=0;i<2;i++) for(int j=1;j<=n;j++) cin >> grid[i][j];
    for(int i=1;i<=n;i++) {
        dp[i] = dp[i-1]+score(grid[0][i]+grid[1][i]);
        if(i>=2) dp[i] = max(dp[i], dp[i-2]+score(grid[0][i-1]+grid[0][i])+score(grid[1][i-1]+grid[1][i]));
    }
    cout << dp[n];
}