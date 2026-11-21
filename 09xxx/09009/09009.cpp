#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int fibo[1000] = {0, 1}; int idx=0;
    for(int i=2;i<=999;i++) {
        fibo[i]=fibo[i-1]+fibo[i-2];
        idx++;
        if(fibo[i]>=1000000000) break;
    }

    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int arr[10000]; int size=-1;
        for(int i=idx;i>=0;i--) {
            if(n>=fibo[i]) {
                arr[++size]=fibo[i];
                n-=fibo[i];
                if(n==0) break;
            }
        }

        for(int i=size;i>=0;i--) {
            cout << arr[i] << ' ';
        }
        cout << '\n';
    }
}