#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K, N; cin >> K >> N;

    int A[K];
    long long left=0, right=0;
    for(int i=0;i<K;i++) {
        cin >> A[i];
        right = max(right, (long long)A[i]);
    }

    while(left<right) {
        int mid = (left+right+1)/2;
        long long cnt=0;
        for(int i=0;i<K;i++) {
            cnt += A[i]/mid;
        }

        if(cnt>=N) {
            left=mid;
        } else {
            right=mid-1;
        }
    }
    cout << right;
}