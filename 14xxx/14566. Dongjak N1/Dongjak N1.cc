#include<bits/stdc++.h>
using namespace std;

int arr[5000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> arr[i];
    sort(arr, arr+n);

    int dist=INT_MAX, cnt=0;
    for(int i=1;i<n;i++) {
        if(dist>arr[i]-arr[i-1]) {
            dist = arr[i]-arr[i-1];
            cnt=1;
        } else if(dist==arr[i]-arr[i-1]) {
            cnt++;
        }
    }
    cout << dist << ' ' << cnt;
}