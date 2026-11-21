#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    long long capacity[N];
    long long left=1, right=1;
    for(int i=0;i<N;i++) {
        cin >> capacity[i];
        right = max(right, capacity[i]);
    }

    while(left<right) {
        long long mid = (left+right+1)/2;
        long long cnt=0;
        for(int i=0;i<N;i++) {
            cnt += capacity[i]/mid;
        }

        if(cnt>=K) left=mid;
        else right=mid-1;
    }
    cout << left;
}