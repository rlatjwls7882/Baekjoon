#include<bits/stdc++.h>
using namespace std;

long long MOD = 900'528;

int idx[128];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a, b; cin >> a >> b;

    for(int i=0;i<a.length();i++) {
        idx[a[i]] = i+1;
    }

    long long res=0;
    for(char ch:b) {
        res = (res*a.length()+idx[ch])%MOD;
    }
    cout << res;
}