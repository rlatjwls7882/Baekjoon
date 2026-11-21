#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    int y=2024, m=8+(n-1)*7;

    cout << y+(m-1)/12 << ' ' << (m-1)%12+1;
}