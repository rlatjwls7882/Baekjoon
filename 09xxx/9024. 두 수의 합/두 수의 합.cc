#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n, k; cin >> n >> k;
        int arr[n];
        for(int i=0;i<n;i++) {
            cin >> arr[i];
        }
        sort(arr, arr+n);

        int left=0, right=n-1, minDiff=1000000000, cnt=0;
        while(left<right) {
            int sum=arr[left]+arr[right];
            if(abs(sum-k)==minDiff) {
                cnt++;
            } else if(abs(sum-k)<minDiff) {
                minDiff=abs(sum-k);
                cnt=1;
            }
            if(sum>k) right--;
            else left++;
        }
        cout << cnt << '\n';
    }
}