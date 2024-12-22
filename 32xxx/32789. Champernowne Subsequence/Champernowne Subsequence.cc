#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;
    
    int idx=0;
    for(int i=1;;i++) {
        string cur = to_string(i);
        for(int j=0;j<cur.length() && idx<n;j++) {
            if(s[idx]==cur[j]) idx++;
        }
        if(idx==n) {
            cout << i;
            return 0;
        }
    }
}