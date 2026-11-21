#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }

    int _max=1;
    int len[n];
    for(int i=0;i<n;i++) {
        len[i]=1;
        for(int j=i-1;j>=0;j--) {
            if(arr[j]<arr[i]) {
                len[i] = max(len[i], len[j]+1);
            }
        }
        _max = max(_max, len[i]);
    }
    cout << _max;
}