#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int sum=0;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
        sum += arr[i];
    }
    sort(arr, arr+N);

    int cnt1=0;
    for(int i=0;i<N/2;i++) {
        cnt1 += arr[i];
    }
    cout << cnt1 << ' ' << sum-cnt1;
}