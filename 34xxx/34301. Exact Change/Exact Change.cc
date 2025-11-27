#include<bits/stdc++.h>
using namespace std;

int res[5];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    res[4] = n/150; n%=150;
    res[3] = n/30; n%=30;
    res[2] = n/15; n%=15;
    res[1] = n/5; n%=5;
    res[0] = n;
    for(int i=0;i<5;i++) cout << res[i] << ' ';
}