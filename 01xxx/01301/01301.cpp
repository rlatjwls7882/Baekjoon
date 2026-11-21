#include<bits/stdc++.h>
using namespace std;

long long dp[6][6][11][11][11][11][11]; // dp[llast][last][a][b][c][d][e]

long long find(int llast, int last, int a, int b, int c, int d, int e) {
    if(dp[llast][last][a][b][c][d][e]!=-1) return dp[llast][last][a][b][c][d][e];
    if(!a && !b && !c && !d && !e) return dp[llast][last][a][b][c][d][e]=1;

    dp[llast][last][a][b][c][d][e]=0;
    if(llast!=0 && last!=0 && a) dp[llast][last][a][b][c][d][e] += find(last, 0, a-1, b, c, d, e);
    if(llast!=1 && last!=1 && b) dp[llast][last][a][b][c][d][e] += find(last, 1, a, b-1, c, d, e);
    if(llast!=2 && last!=2 && c) dp[llast][last][a][b][c][d][e] += find(last, 2, a, b, c-1, d, e);
    if(llast!=3 && last!=3 && d) dp[llast][last][a][b][c][d][e] += find(last, 3, a, b, c, d-1, e);
    if(llast!=4 && last!=4 && e) dp[llast][last][a][b][c][d][e] += find(last, 4, a, b, c, d, e-1);
    return dp[llast][last][a][b][c][d][e];
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int remain[5] = {0, };
    for(int i=0;i<N;i++) cin >> remain[i];
    memset(dp, -1, sizeof(dp));
    cout << find(5, 5, remain[0], remain[1], remain[2], remain[3], remain[4]);
}