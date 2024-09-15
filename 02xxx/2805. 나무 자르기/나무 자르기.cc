#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int A[N];
    int left=0, right=0;
    for(int i=0;i<N;i++) {
        cin >> A[i];
        right = max(right, A[i]);
    }

    while(left<right) {
        int mid = (left+right+1)/2;
        long long sum=0;
        for(int i=0;i<N;i++) {
            if(A[i]>mid) {
                sum += A[i]-mid;
            }
        }

        if(sum<M) {
            right=mid-1;
        } else {
            left=mid;
        }
    }
    cout << right;
}