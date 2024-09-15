#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);\
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int arr[n];
        for(int i=0;i<n;i++) {
            cin >> arr[i];
        }

        long long profit=0;
        int _max=0, beforePos=0, pos=0;
        while(beforePos<n) {
            for(int i=beforePos;i<n;i++) {
                if(_max<=arr[i]) {
                    _max=arr[i];
                    pos=i;
                }
            }
            for(int i=beforePos;i<pos;i++) {
                profit += _max-arr[i];
            }

            beforePos=pos+1;
            _max=0;
        }
        
        cout << profit << '\n';
    }
}