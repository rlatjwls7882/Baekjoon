#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    while(n-->0) {
        int T; cin >> T;
        long long arr[T];
        for(int i=0;i<T;i++) {
            cin >> arr[i];
        }
        
        int cnt=0;
        long long major=0;
        for(int i=0;i<T;i++) {
            if(cnt==0) major=arr[i];
            if(major==arr[i]) cnt++;
            else cnt--;
        }

        cnt=0;
        for(int i=0;i<T;i++) {
            if(major==arr[i]) cnt++;
        }

        if(cnt>T/2) cout << major << '\n';
        else cout << "SYJKGW\n";
    }
}