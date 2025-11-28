#include<bits/stdc++.h>
using namespace std;

int minCnt[1'000'001], minWater[1'000'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        minCnt[i] = minCnt[i-1]+1;
        minWater[i] = minWater[i-1]+1;
        if(i%3==0 && minCnt[i/3]+1<=minCnt[i]) {
            if(minCnt[i/3]+1==minCnt[i]) minWater[i] = min(minWater[i], minWater[i/3]+3);
            else minWater[i] = minWater[i/3]+3;
            minCnt[i]=minCnt[i/3]+1;
        }
        int sqrtI = (int)sqrt(i);
        if((((int)sqrt(i))*((int)sqrt(i)))==i && minCnt[sqrtI]+1<=minCnt[i]) {
            if(minCnt[sqrtI]+1==minCnt[i]) minWater[i] = min(minWater[i], minWater[sqrtI]+5);
            else minWater[i] = minWater[sqrtI]+5;
            minCnt[i]=minCnt[sqrtI]+1;
        }
    }
    cout << minCnt[n] << ' ' << minWater[n];
}