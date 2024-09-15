#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int cnt[M] = {0, };
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            int clap; cin >> clap;
            cnt[j] += clap;
        }
    }
    int A; cin >> A;

    int left=0, right=0, sum=0, maxSum=0;
    while(right<M) {
        if(right-left<A) sum += cnt[right++];
        else sum = sum-cnt[left++]+cnt[right++];
        maxSum = max(maxSum, sum);
    }
    cout << maxSum;
}