#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int last=-200000;
    while(n--) {
        int cur; cin >> cur;
        if(last<=cur) {
            cout << cur << ' ';
            last = cur;
        }
    }
}