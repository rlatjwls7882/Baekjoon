#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int cnt=0, last=-1;
    while(n--) {
        int x; cin >> x;
        if(x==last+1) {
            cout << -1;
            return 0;
        }
        cnt += (x-last-1)/2+1;
        last = x;
    }
    cout << cnt;
}