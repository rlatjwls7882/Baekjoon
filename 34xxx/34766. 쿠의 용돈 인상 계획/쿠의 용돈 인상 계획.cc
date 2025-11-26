#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int d, k; string s; cin >> d >> k >> s;
        int idx=0;
        for(int i=1;i<d;i++) {
            if(s[i]>'1') idx=i;
        }

        for(int i=0;i<idx;i++) cout << s[i];
        int cur = s[idx]-'0';
        int remain=0; // 81
        while(k--) {
            if(cur==1) cur=9;
            else {
                cur*=9;
                if(cur==81) {
                    remain++;
                    cur=8;
                } else {
                    cout << cur/10;
                    cur%=10;
                }
            }
        }
        cout << cur;
        while(remain--) cout << 1;
        for(int i=idx+1;i<d;i++) cout << s[i];
        cout << '\n';
    }
}