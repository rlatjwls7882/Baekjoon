#include<bits/stdc++.h>
using namespace std;

int cnt[100'001];

bool isSosu(int n) {
    for(int i=2;i*i<=n;i++) {
        if(n%i==0) return false;
    }
    return n!=1;
}

bool chk(int n) {
    if(!isSosu(n+1)) return false;
    int mult=10;
    while(mult<=n) {
        if(!isSosu((n/mult)*(n%mult)+1)) return false;
        mult*=10;
    }
    return true;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    for(int i=1;i<=100'000;i++) cnt[i]=cnt[i-1]+chk(i);

    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        cout << cnt[n] << '\n';
    }
}