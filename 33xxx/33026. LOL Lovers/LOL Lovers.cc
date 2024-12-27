#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;
    for(int i=1;i<n;i++) {
        int L1=0, O1=0;
        for(int j=0;j<i;j++) {
            if(s[j]=='L') L1++;
            else O1++;
        }
        int L2=0, O2=0;
        for(int j=i;j<n;j++) {
            if(s[j]=='L') L2++;
            else O2++;
        }
        if(L1!=L2 && O1!=O2) {
            cout << i;
            return 0;
        }
    }
    cout << -1;
}