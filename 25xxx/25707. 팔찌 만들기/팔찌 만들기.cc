#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> arr(n);
    for(int i=0;i<n;i++) cin >> arr[i];
    sort(arr.begin(), arr.end());

    int sum=0;
    for(int i=0;i<n;i++) sum += abs(arr[i]-arr[(i+1)%n]);
    cout << sum;
}