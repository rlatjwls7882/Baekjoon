#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        string a, b; cin >> a >> b;

        int cnt0=0, cnt1=0;
        for(int i=0;i<a.length();i++) {
            if(a[i]!=b[i]) {
                if(a[i]=='0') cnt0++;
                else cnt1++;
            }
        }
        cout << cnt0+cnt1-min(cnt0, cnt1) << '\n';
    }
}