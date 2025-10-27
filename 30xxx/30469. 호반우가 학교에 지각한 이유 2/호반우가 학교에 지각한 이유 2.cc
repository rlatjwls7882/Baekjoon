#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, n; cin >> a >> b >> n;
    if(b/10%2==0 || b/10==5) {
        cout << -1;
    } else {
        cout << a;
        if(a%10==9) cout << 7;
        else cout << 1;
        for(int i=0;i<n-5;i++) cout << 1;
        cout << b;
    }
}