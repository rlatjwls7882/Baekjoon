#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int l, a; cin >> l >> a;

    int last; cin >> last;
    while(l--) {
        int cur; cin >> cur;
        if(cur>last+a) {
            cout << "BUG REPORT";
            return 0;
        }
        last=cur;
    }
    cout << "POSSIBLE";
}