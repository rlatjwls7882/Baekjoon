#include<bits/stdc++.h>
using namespace std;

map<string, string> oppo = {
    {"Whiteking", "Blackking"},
    {"Blackking", "Whiteking"},
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int ret=0;
    while(n--) {
        int a; cin >> a;
        ret ^= a-2;
    }
    string s; cin >> s;
    cout << (ret ? s : oppo[s]);
}