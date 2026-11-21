#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, t; cin >> n >> t;
    string s; cin >> s;

    int sz = 1<<n-t;

    string res="0";
    for(int i=0;i<s.length();i+=sz) {
        res = max(res, s.substr(i, sz));
    }
    cout << res;
}