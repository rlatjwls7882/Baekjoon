#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, K; cin >> N >> K;
    vector<int> v(N);
    for(int i=0;i<N;i++) cin >> v[i];

    long long left=1, right=2000000000;
    while(left<right) {
        long long mid = (left+right+1)/2;
        long long cnt=0;
        for(int i=0;i<N;i++) cnt += max(0LL, mid-v[i]);
        if(cnt<=K) left=mid;
        else right=mid-1;
    }
    cout << left;
}