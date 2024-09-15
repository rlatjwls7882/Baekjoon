#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;
    ll first=0, second=1;

    while(N-->0) {
        ll A; cin >> A;
        ll lcm = A*second/__gcd(second, A);

        first = first*(lcm/second)+lcm/A;
        second = lcm;
    }

    ll gcd = __gcd(first, second);
    cout << second/gcd << "/" << first/gcd;
}