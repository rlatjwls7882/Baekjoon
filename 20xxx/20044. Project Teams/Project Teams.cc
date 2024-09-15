#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N*2];
    for(int i=0;i<2*N;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+2*N);

    int _min=INT_MAX;
    for(int i=0;i<N;i++) {
        _min = min(_min, arr[i]+arr[2*N-1-i]);
    }
    cout << _min;
}