#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }
    
    int cnt=0;
    while(true) {
        bool chk=true;
        for(int i=0;i<n-1;i++) {
            if(arr[i]>=arr[i+1]) {
                int diff = arr[i]-arr[i+1]+1;
                cnt += diff;
                arr[i] -= diff;
                chk=false;
            }
        }
        if(chk) break;
    }
    cout << cnt;
}