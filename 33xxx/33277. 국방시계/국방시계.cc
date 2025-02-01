#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long double n, m; cin >> n >> m;
    int t = 24*60/n*m;

    if(t/60<10) cout << 0;
    cout << t/60 << ':';
    if(t%60<10) cout << 0;
    cout << t%60;
}