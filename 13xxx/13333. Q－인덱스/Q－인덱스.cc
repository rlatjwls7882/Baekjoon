#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+n);

    for(int i=arr[n-1];i>=0;i--) {
        int cnt=0;
        for(int j=n-1;j>=0;j--) {
            if(arr[j]>=i) cnt++;
        }
        if(cnt>=i) {
            cout << i;
            return 0;
        }
    }
}