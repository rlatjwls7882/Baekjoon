#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int ret=0;
    while(n--) {
        int a; cin >> a;
        ret^=a;
    }
    cout << (ret?"koosaga":"cubelover");
}