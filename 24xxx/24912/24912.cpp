#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    for(int i=0;i<n-1;i++) {
        if(arr[i]!=0 && arr[i]==arr[i+1]) {
            cout << -1;
            return 0;
        }
    }

    for(int i=0;i<n;i++) {
        if(arr[i]==0) {
            bool chk[3] = {false, };
            if(i-1>=0) chk[arr[i-1]-1]=true;
            if(i+1<n && arr[i+1]!=0) chk[arr[i+1]-1]=true;
            for(int j=0;j<3;j++) {
                if(!chk[j]) {
                    arr[i] = j+1;
                    break;
                }
            }
        }
    }
    for(int i=0;i<n;i++) cout << arr[i] << ' ';
}