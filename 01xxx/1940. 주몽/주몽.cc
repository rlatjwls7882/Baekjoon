#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+n);
    
    int left=0, right=n-1, cnt=0;
    while(left<right) {
        if(arr[left]+arr[right]==m) {
            cnt++;
            left++;
            right--;
        } else if(arr[left]+arr[right]>m) {
            right--;
        } else {
            left++;
        }
    }
    cout << cnt;
}