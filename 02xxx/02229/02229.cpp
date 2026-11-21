#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N+1];
    for(int i=1;i<=N;i++) {
        cin >> arr[i];
    }

    int sum[N+1] = {0, };
    for(int i=1;i<=N;i++) {
        int maxVal = arr[i];
        int minVal = arr[i];
        for(int j=i-1;j>0;j--) {
            maxVal = max(maxVal, arr[j]);
            minVal = min(minVal, arr[j]);
            sum[i] = max(sum[i], sum[j-1]+maxVal-minVal);
        }
    }
    cout << sum[N];
}