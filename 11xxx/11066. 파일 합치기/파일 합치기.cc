#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'000'000;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int k; cin >> k;
        int _size[k][k], dp[k][k]; fill(&dp[0][0], &dp[k-1][k], MAX); // dp[start][end]
        for(int i=0;i<k;i++) {
            cin >> _size[i][i];
            dp[i][i]=0; // length == 1
        }

        // length == 2
        for(int start=0;start+1<k;start++) {
            dp[start][start+1] = _size[start][start+1] = _size[start][start]+_size[start+1][start+1];
        }

        // length > 2
        for(int length=3;length<=k;length++) {
            for(int start=0;start+length-1<k;start++) {
                int end = start+length-1;
                _size[start][end] = _size[start][start]+_size[start+1][end];
                for(int mid=start;mid<end;mid++) {
                    dp[start][end] = min(dp[start][end], dp[start][mid]+dp[mid+1][end]+_size[start][end]);
                }
            }
        }
        cout << dp[0][k-1] << '\n';
    }
}