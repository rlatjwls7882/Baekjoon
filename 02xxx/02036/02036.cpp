#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    long long arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+n);

    long long sum=0;
    for(int i=0;i<n;) {
        if(arr[i]<0 && i+1<n && arr[i+1]<=0) {
            sum += arr[i]*arr[i+1];
            i+=2;
        } else if(arr[i]<0) {
            sum += arr[i];
            i++;
        } else {
            break;
        }
    }
    for(int i=n-1;i>=0;) {
        if(arr[i]>1 && i-1>=0 && arr[i-1]>1) {
            sum += arr[i]*arr[i-1];
            i-=2;
        } else if(arr[i]>0) {
            sum += arr[i];
            i--;
        } else {
            break;
        }
    }
    cout << sum;
}