#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int k; cin >> k;
    k = N/k;
    for(int i=0;i<N;i+=k) {
        sort(arr+i, arr+i+k);
    }

    for(int i=0;i<N;i++) {
        cout << arr[i] << ' ';
    }
}