#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    if(n==1) cout << "YES\n1";
    else if(n==2) cout << "NO";
    else if(n==3) cout << "YES\n1 3 2";
    else {
        cout << "YES\n4 2 3 1";
        for(int i=5;i<=n;i++) cout << ' ' << i;
    }
}