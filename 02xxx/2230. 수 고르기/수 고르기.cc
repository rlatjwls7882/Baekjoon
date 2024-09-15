#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+N);

    int left=0, right=0, minVal=INT_MAX;
    while(right<N) {
        int diff = arr[right]-arr[left];

        if(diff>=M) {
            minVal = min(minVal, diff);
            left++;
        } else {
            right++;
        }
    }
    cout << minVal;
}