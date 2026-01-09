#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll n[100'000], a[100'000];

bool chk(ll remain, ll i) {
    if(remain>=1 && n[i]==1) return true;
    ll use=0;
    while(remain>=n[i]) {
        ll cur=remain/n[i];
        remain-=cur*(n[i]-1);
        use+=cur*n[i];
        if(use+remain>=a[i]) return true;
    }
    return use+remain>=a[i];
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int m; cin >> m;
    for(int i=0;i<m;i++) cin >> n[i];
    for(int i=0;i<m;i++) cin >> a[i];

    for(int i=0;i<m;i++) {
        ll l=0, r=1e9;
        while(l<r) {
            ll m = l+r>>1;
            if(chk(m, i)) r=m;
            else l=m+1;
        }
        cout << l << ' ';
    }
}