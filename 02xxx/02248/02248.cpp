#include <bits/stdc++.h>
using namespace std;

long long N, L, I;
long long dp[32][32] = {0, };
int res[32];

int makeDp(int l, int n) {
    if(dp[l][n]) return dp[l][n];
    if(l==0 || n==0) return dp[l][n]=1;

    dp[l][n] += makeDp(l, n-1);
    if(l>0) dp[l][n] += makeDp(l-1, n-1);
    return dp[l][n];
}

void makeBin(int l, int n, int depth) {
    while(I!=dp[l][n]) {
        if(I<=dp[l][n-1]) {
            res[depth++]=0;
        } else {
            res[depth++]=1;
            I -= dp[l][n-1];
            l--;
        }
        n--;
    }
    while(depth<N) {
        if(l>0) res[depth]=1;
        else res[depth]=0;
        depth++;
        l--;
    }
}

int main(){
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> L >> I;
    makeDp(L, N);

    makeBin(L, N, 0);
    for(int i=0;i<N;i++) cout << res[i];
}