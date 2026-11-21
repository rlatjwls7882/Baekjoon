#include<bits/stdc++.h>
using namespace std;

long long arr[300000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> arr[i];

    long long val=0;
    for(int i=n-1;i>=0;i--) {
        if(val<=arr[i]) {
            val=arr[i];
        } else {
            val = (val+arr[i]-1)/arr[i]*arr[i];
        }
    }
    cout << val;
}