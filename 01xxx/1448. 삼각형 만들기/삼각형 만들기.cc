#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+N, greater<int>());

    for(int i=2;i<N;i++) {
        if(arr[i-2]<arr[i-1]+arr[i]) {
            cout << arr[i-2]+arr[i-1]+arr[i];
            return 0;
        }
    }
    cout << -1;
}