#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    cout << "? 1\n" << flush;
    int left; cin >> left;

    cout << "? " << n << '\n' << flush;
    int right; cin >> right;

    cout << "! " << right - left;
}