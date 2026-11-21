#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N, k; cin >> N >> k;

    long long left=1, right=N*N;
    while(left<right) {
        long long mid = (left+right)/2;

        // cnt: mid보다 작거나 같은 수의 개수
        long long cnt=0;
        for(long long i=1;i<=N;i++) cnt += min(N, mid/i);
        if(cnt>=k) right=mid;
        else left=mid+1;
    }
    cout << left;
}