#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    int res; cin >> res;
    while(n-->1) {
        int next; cin >> next;
        res ^= next;
    }
    cout << (res ? "koosaga" : "cubelover");
}