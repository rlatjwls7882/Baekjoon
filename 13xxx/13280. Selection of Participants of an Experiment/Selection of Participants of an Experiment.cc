#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n; cin >> n;
        if(n==0) break;
        int arr[n];
        for(int i=0;i<n;i++) cin >> arr[i];
        sort(arr, arr+n);

        int diff=arr[1]-arr[0];
        for(int i=2;i<n;i++) diff = min(diff, arr[i]-arr[i-1]);
        cout << diff << '\n';
    }
}