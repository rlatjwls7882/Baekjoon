#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, a, b; cin >> n >> a >> b;
    while(n-->2) {
        a = b;
        cin >> b;
    }
    cout << b + (b-a);
}