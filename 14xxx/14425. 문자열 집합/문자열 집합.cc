#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    set<string> strs;
    while(n--) {
        string s; cin >> s;
        strs.insert(s);
    }

    int cnt=0;
    while(m--) {
        string s; cin >> s;
        cnt += strs.count(s);
    }
    cout << cnt;
}