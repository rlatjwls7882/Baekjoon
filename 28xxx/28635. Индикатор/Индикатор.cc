#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int m, a, b; cin >> m >> a >> b;
    if(a<=b) cout << b-a;
    else cout << m-a + b; 
}