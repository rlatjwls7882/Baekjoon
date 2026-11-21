#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, a, b, c; cin >> n >> a >> b >> c;
    if(a<=n) cout << "Watermelon";
    else if(b<=n) cout << "Pomegranates";
    else if(c<=n) cout << "Nuts";
    else cout << "Nothing";
}