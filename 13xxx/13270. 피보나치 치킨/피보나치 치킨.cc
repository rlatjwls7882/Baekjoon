#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int fibo[19] = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};

    int N; cin >> N;
    int maxCnt[N+1] = {0, }, minCnt[N+1]; fill(minCnt, minCnt+N+1, 1000000000);
    minCnt[0]=0;
    for(int i=1;i<19;i++) {
        for(int j=fibo[i];j<=N;j++) {
            if(j==fibo[i] || maxCnt[j-fibo[i]]) maxCnt[j] = max(maxCnt[j], maxCnt[j-fibo[i]]+fibo[i-1]);
            if(j==fibo[i] || minCnt[j-fibo[i]]) minCnt[j] = min(minCnt[j], minCnt[j-fibo[i]]+fibo[i-1]);
        }
    }
    cout << minCnt[N] << ' ' << maxCnt[N];
}