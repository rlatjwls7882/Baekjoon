#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    ll last; cin >> last;
    while(n-->1) {
        ll cur; cin >> cur;
        if(last==cur) {
            cout << 0;
            return 0;
        }
        last=cur;
    }
    cout << 1;
}