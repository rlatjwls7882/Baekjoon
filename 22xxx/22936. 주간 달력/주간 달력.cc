#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;

    int endPos[50001] = {0, }, cutCnt[50001] = {0, }, imos[50001] = {0, };
    while(m-->0) {
        int s, e; cin >> s >> e;
        endPos[e-1]++;
        cutCnt[s-1]++;
        cutCnt[e-1]--;
        imos[s-1]++;
        imos[e]--;
    }

    for(int i=0;i<50000;i++) {
        cutCnt[i+1] += cutCnt[i];
        imos[i+1] += imos[i];
    }

    int sum=0;
    for(int i=0;i<n*7;i++) sum += imos[i];

    int maxSum=sum, maxIdx=0;
    for(int i=n*7;i<50000;i++) {
        sum = sum+imos[i]-imos[i-n*7];
        if(maxSum<sum) {
            maxSum=sum;
            maxIdx=i-n*7+1;
        }
    }

    int cut=0;
    for(int i=maxIdx;i<maxIdx+n*7;i++) {
        if((i-maxIdx)%7==6) cut += cutCnt[i];
        cut += endPos[i];
    }
    cout << cut;
}