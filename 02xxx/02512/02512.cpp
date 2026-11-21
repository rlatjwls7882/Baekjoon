#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N], left=0, right=0;
    for(int i=0;i<N;i++) {
        cin >> arr[i];
        right = max(right, arr[i]);
    }

    int M; cin >> M;
    while(left<right) {
        int mid = (left+right+1)/2;
        int sum=0;
        for(int i=0;i<N;i++) {
            sum += min(mid, arr[i]);
        }

        if(sum<=M) {
            left=mid;
        } else {
            right=mid-1;
        }
    }
    cout << right;
}