#include<bits/stdc++.h>
using namespace std;

string s[15];
int n, k, arr[15], mult[15];
long long dp[100][1<<15];
// dp[num][visited] : 현재까지 연결한 수의 나머지가 num이고, 현재까지 탐색한 조합이 visited일 때 이것으로 만들 수 있는 나머지가 0인 수의 개수

long long dfs(int num, int visited) {
    if(visited+1 == 1<<n) return num%k==0;
    if(dp[num][visited]!=-1) return dp[num][visited];
    dp[num][visited]=0;
    for(int i=0;i<n;i++) {
        if(!(visited & (1<<i))) {
            int nextNum = (num*mult[i] + arr[i]) % k;
            dp[num][visited] += dfs(nextNum, visited | (1<<i));
        }
    }
    return dp[num][visited];
}

long long fact() {
    long long ret=1;
    for(int i=2;i<=n;i++) ret *= i;
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> s[i];
    cin >> k;

    for(int i=0;i<n;i++) {
        mult[i]=1;
        for(int j=0;j<s[i].length();j++) {
            arr[i] = (arr[i]*10 + s[i][j]-'0') % k;
            mult[i] = mult[i]*10%k;
        }
    }
    memset(dp, -1, sizeof dp);

    long long cnt = dfs(0, 0);
    long long total = fact();
    long long gcdVal = gcd(cnt, total);
    cout << cnt/gcdVal << '/' << total/gcdVal;
}