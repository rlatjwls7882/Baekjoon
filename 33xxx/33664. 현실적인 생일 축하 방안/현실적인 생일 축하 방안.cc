#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long b, n, m; cin >> b >> n >> m;
    
    map<string, long long> items;
    while(n--) {
        string s; long long p; cin >> s >> p;
        items[s] = p;
    }
    
    while(m--) {
        string s; cin >> s;
        b -= items[s];
    }
    cout << (b>=0 ? "acceptable" : "unacceptable");
}