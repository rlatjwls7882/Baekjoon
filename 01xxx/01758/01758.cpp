#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+n, greater<int>());
    
    ll sum=0;
    for(int i=0;i<n;i++) {
        sum += max(0, arr[i]-i);
    }
    cout << sum;
}