#include<bits/stdc++.h>
using namespace std;

long long cnt, n, x;
long long dp[51][2]; // {총 개수, 패티의 개수}

void getCnt(int depth) { // 총 번의 개수 계산
    if(x==0) return;

    if(x-1>=0) x--; // 햄버거번

    if(x-dp[depth-1][0]>=0) { // 레벨-1 버거
        x -= dp[depth-1][0];
        cnt += dp[depth-1][1];
    } else {
        getCnt(depth-1);
    }

    if(x-1>=0) { // 패티
        cnt++;
        x--;
    }

    if(x-dp[depth-1][0]>=0) { // 레벨-1 버거
        x -= dp[depth-1][0];
        cnt += dp[depth-1][1];
    } else {
        getCnt(depth-1);
    }

    if(x-1>=0) x--; // 햄버거번
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    dp[0][0]=dp[0][1]=1;
    for(int i=1;i<=50;i++) {
        dp[i][0] = dp[i-1][0]*2+3;
        dp[i][1] = dp[i-1][1]*2+1;
    }

    cin >> n >> x;
    getCnt(n);
    cout << cnt;
}