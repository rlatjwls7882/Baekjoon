#include<bits/stdc++.h>
using namespace std;

long long MOD = 900'528;

int idx[128];

long long pow(long long n, long long r) {
    if(r==0) return 1;
    if(r==1) return n;

    long long ret = pow(n, r/2);
    if(r%2) return ret*ret%MOD*n%MOD;
    return ret*ret%MOD;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a, b; cin >> a >> b;

    for(int i=0;i<a.length();i++) {
        idx[a[i]] = i;
    }

    long long res=1;
    for(int i=1;i<=b.length()-1;i++) { // 더 적은 길이
        res = (res+pow((long long)a.length(), (long long)i))%MOD;
    }
    for(int i=0;i<b.length();i++) { // 같은 길이
        res = (res+idx[b[i]]*pow((long long)a.length(), (long long)(b.length()-i-1)))%MOD;
    }
    cout << res;
}