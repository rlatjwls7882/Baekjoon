#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int cnt;
vector<char> res;

bool modChk(ll n) {
    while(n%2==0) cnt++, n/=2;
    return n==1;
}

void solve(ll n) {
    for(int i=0;i<cnt;i++) res.push_back('D');
    if(n<0) {
        n*=-1;
        while(n) {
            if(n&1) res.push_back('L');
            n>>=1;
            res.push_back('U');
        }
    } else {
        while(n) {
            if(n&1) res.push_back('R');
            n>>=1;
            res.push_back('U');
        }
    }
    cout << res.size() << '\n';
    for(auto e:res) cout << e;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n, d; cin >> n >> d;
    ll gcdVal = gcd(n, d);
    n/=gcdVal;
    d/=gcdVal;
    if(d<0) {
        n*=-1;
        d*=-1;
    }
    if(!modChk(d)) {
        cout << -1;
        return 0;
    }
    solve(n);
}