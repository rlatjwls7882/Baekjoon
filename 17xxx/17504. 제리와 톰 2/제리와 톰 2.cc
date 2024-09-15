#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

ll _gcd(ll a, ll b) {
    while(b!=0) {
        ll tmp=a%b;
        a=b;
        b=tmp;
    }
    return a;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    ll a[N];
    for(int i=0;i<N;i++) {
        cin >> a[i];
    }

    ll last1=1, last2=a[N-1];
    for(int i=N-2;i>=0;i--) {
        last1 += last2*a[i];
        ll gcd = _gcd(last1, last2);

        ll tmp = last1/gcd;
        last1 = last2/gcd;
        last2 = tmp;
    }
    cout << last2-last1 << " " << last2;
}