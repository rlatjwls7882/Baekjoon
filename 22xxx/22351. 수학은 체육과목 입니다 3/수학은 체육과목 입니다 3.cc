#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    string make = "";
    int idx=0, first=1;
    for(int i=1;i<=999;i++) {
        make += to_string(i);
        while(idx<make.length() && idx<s.length() && make[idx]==s[idx]) {
            idx++;
        }

        if(idx!=make.length()) {
            make = "";
            idx=0;
            first=i+1;
        } else if(idx==s.length()) {
            cout << first << ' ' << i;
            return 0;
        }
    }
}