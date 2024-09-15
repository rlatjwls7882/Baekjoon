#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

ll _gcd(ll a, ll b) {
    while(b!=0) {
        ll tmp = a%b;
        a=b;
        b=tmp;
    }
    return a;
}

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);

    int size=1000001;
    bool notPrime[size] = {true, true, false, };
    for(int i=2;i*i<=size;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<=size;j+=i) {
                notPrime[j]=true;
            }
        }
    }

    int N; cin >> N;
    ll lcm=1;
    while(N-->0) {
        long tmp; cin >> tmp;
        if(!notPrime[tmp]) {
            lcm = lcm*tmp/_gcd(lcm, tmp);
        }
    }
    cout << (lcm==1?-1:lcm);
}