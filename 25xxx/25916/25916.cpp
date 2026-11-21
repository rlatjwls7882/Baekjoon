#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int left=0, right=0, sum=0, maxSum=0;
    while(right<N) {
        sum += arr[right++];
        while(sum>M) {
            sum -= arr[left++];
        }
        maxSum = max(maxSum, sum);
    }
    cout << maxSum;
}