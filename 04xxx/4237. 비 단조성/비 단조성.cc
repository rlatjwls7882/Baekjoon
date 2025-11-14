#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;

        int llast=n+1, last=-1, cnt=0;
        while(n--) {
            int cur; cin >> cur;
            if(llast<last && last>cur || llast>last && last<cur) cnt++;
            llast=last;
            last=cur;
        }
        cout << cnt << '\n';
    }
}