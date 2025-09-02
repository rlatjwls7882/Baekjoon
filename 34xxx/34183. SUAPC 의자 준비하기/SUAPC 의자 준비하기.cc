#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, a, b; cin >> n >> m >> a >> b;

    int total=0;
    if(n*3>m) total = (n*3-m)*a+b;
    cout << total;
}