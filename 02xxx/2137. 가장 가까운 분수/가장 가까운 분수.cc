#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b; cin >> a >> b;
    ll curA=9999, curB=1;
    for(ll nextB=2;nextB<=32767;nextB++) {
        ll lcm = nextB*b/gcd(nextB, b);
        ll nextA = (a*lcm/b-1)/(lcm/nextB);

        lcm = curB*lcm/gcd(curB, lcm);
        if(abs(a*lcm/b-nextA*lcm/nextB)<abs(a*lcm/b-curA*lcm/curB)) {
            curA=nextA;
            curB=nextB;
            ll gcdVal = gcd(curA, curB);
            curA/=gcdVal;
            curB/=gcdVal;
        }

        lcm = nextB*b/gcd(nextB, b);
        nextA = (a*lcm/b+1)/(lcm/nextB);
        if(nextA<nextB) {
            lcm = curB*lcm/gcd(curB, lcm);
            if(abs(a*lcm/b-nextA*lcm/nextB)<abs(a*lcm/b-curA*lcm/curB)) {
                curA=nextA;
                curB=nextB;
                ll gcdVal = gcd(curA, curB);
                curA/=gcdVal;
                curB/=gcdVal;
            }
        }
    }
    cout << curA << ' ' << curB;
}