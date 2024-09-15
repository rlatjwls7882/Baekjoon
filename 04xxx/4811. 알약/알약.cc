#include <bits/stdc++.h>
using namespace std;

long long dp[31][31] = {0, };

long long find(int w, int h) {
    if(dp[w][h]) return dp[w][h];
    if(w==0 && h==0) return dp[w][h]=1;

    if(w) dp[w][h] += find(w-1, h+1);
    if(h) dp[w][h] += find(w, h-1);
    return dp[w][h];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int N; cin >> N;
        if(N==0) break;
        cout << find(N, 0) << '\n';
    }
}