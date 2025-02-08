#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, a, b, s, t; cin >> n >> a >> b >> s >> t;
    if(s>t) swap(s, t);

    if(a+1<=s && s<=b-1 && a+1<=t && t<=b-1) cout << "City";
    else if(t<=a || s>=b) cout << "Outside";
    else cout << "Full";
}