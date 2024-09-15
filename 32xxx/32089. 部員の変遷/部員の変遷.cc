#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n; cin >> n;
        if(n==0) break;

        int a[n];
        for(int i=0;i<n;i++) {
            cin >> a[i];
        }

        if(n==1) {
            cout << a[0] << '\n';
        } else if(n==2) {
            cout << a[0]+a[1] << '\n';
        } else {
            int maxCnt=0;
            for(int i=2;i<n;i++) {
                maxCnt = max(maxCnt, a[i-2]+a[i-1]+a[i]);
            }
            cout << maxCnt << '\n';
        }
    }
}
