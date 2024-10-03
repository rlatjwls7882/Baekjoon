#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];

    int preSum[n];
    for(int i=0;i<n;i++) {
        preSum[i] = arr[i];
        if(i) preSum[i] += preSum[i-1];
    }

    int maxVal=0;
    for(int i=1;i<n-1;i++) {
        maxVal = max(maxVal, (preSum[n-2]-arr[i])+(preSum[i-1])); // 꿀벌 위치 : 오른쪽 끝, 중간
        maxVal = max(maxVal, (preSum[n-1]-arr[0]-arr[i])+(preSum[n-1]-preSum[i])); // 꿀벌 위치 : 왼쪽 끝, 중간
        maxVal = max(maxVal, (preSum[i]-arr[0])+(preSum[n-2]-preSum[i-1])); // 꿀벌 위치 : 왼쪽 끝, 오른쪽 끝
    }
    cout << maxVal;
}