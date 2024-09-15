#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, k; cin >> n >> k;
    if(k*(k+1)/2>n) {
        cout << -1;
        return 0;
    }
    
    int arr[k];
    for(int i=0;i<k;i++) {
        arr[i] = i+1;
    }
    n -= k*(k+1)/2;
    
    while(n>0) {
        for(int i=k-1;i>=0 && n>0;i--) {
            arr[i]++;
            n--;
        }
    }
    cout << arr[k-1]-arr[0];
}