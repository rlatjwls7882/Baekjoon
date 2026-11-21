#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    if(n==1) {
        cout << "1\n1 1";
    } else {
        cout << 2*(n-1) << '\n';
        for(int i=1;i<=n-1;i++) cout << "1 " << i << '\n' << n << ' ' << i << '\n';
    }
}