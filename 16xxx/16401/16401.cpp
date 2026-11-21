#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long M, N; cin >> M >> N;
    vector<long long> L(N);
    for(int i=0;i<N;i++) cin >> L[i];

    long long left=0, right=1000000000;
    while(left<right) {
        long long mid = (left+right+1)/2;
        long long cnt=0;
        for(int i=0;i<N;i++) cnt += L[i]/mid;

        if(cnt>=M) left=mid;
        else right=mid-1;
    }
    cout << left;
}