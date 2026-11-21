#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    long long preSum[N];
    for(int i=0;i<N;i++) {
        int tmp; cin >> tmp;
        if(i==0) preSum[i]=tmp;
        else preSum[i] = preSum[i-1]+tmp;
    }
    sort(preSum, preSum+N, greater<long long>());

    long long sum=0;
    for(int i=0;i<K;i++) {
        sum += preSum[i];
    }
    cout << sum;
}