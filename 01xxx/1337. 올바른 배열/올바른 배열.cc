#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+n);

    int min_val=4, first=0, last=0;
    while(last<n) {
        if(arr[last]-arr[first]>4) {
            first++;
        } else {
            min_val = min(min_val, max(0, 4-(last-first)));
            last++;
        }
    }
    cout << min_val;
}