#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        string s; cin >> s;
        while(n-->1) {
            string a; cin >> a;
            if(s[0]>=a[0]) s = a+s;
            else s = s+a;
        }
        cout << s << '\n';
    }
}