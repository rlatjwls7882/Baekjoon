#include<bits/stdc++.h>
using namespace std;

int arr[100001], preSum[100001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    for(int i=1;i<=N;i++) cin >> arr[i];

    for(int i=1;i<N;i++) {
        if(arr[i]>arr[i+1]) preSum[i]++;
        preSum[i+1] = preSum[i];
    }

    int Q; cin >> Q;
    while(Q-->0) {
        int x, y; cin >> x >> y;
        cout << preSum[y-1] - preSum[x-1] << '\n';
    }
}