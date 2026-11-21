#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    map<string, string> password;
    while(n--) {
        string a, b; cin >> a >>  b;
        password[a]=b;
    }

    while(m--) {
        string a; cin >> a;
        cout << password[a] << '\n';
    }
}