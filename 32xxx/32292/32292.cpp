#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; string s; cin >> n >> s;
        while(s.find("ABB")!=s.npos) s.replace(s.find("ABB"), 3, "BA");
        cout << s << '\n';
    }
}
