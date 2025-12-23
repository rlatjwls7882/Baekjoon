#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int a, t; cin >> a >> t;
    cout << max(0, 10+2*(25-a+t));
}