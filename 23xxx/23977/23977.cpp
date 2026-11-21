#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

ll gcd(ll a, ll b) {
    while(b!=0) {
        ll tmp = a%b;
        a=b;
        b=tmp;
    }
    return a;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K, N; cin >> K >> N;
    
    ll last; cin >> last;
    while(N-->1) {
        ll cur; cin >> cur;
        last = last*cur/gcd(cur, last);
    }
    cout << last-K;
}