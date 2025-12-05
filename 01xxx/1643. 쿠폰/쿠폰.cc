#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

void mod(ll &a, ll &b) {
    ll gcdVal = gcd(a, b);
    a/=gcdVal;
    b/=gcdVal;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int n; cin >> n;
        if(cin.fail()) break;

        ll a=1, b=1;
        for(int i=2;i<=n;i++) {
            a = a*i+b;
            b*=i;
            mod(a, b);
        }
        a*=n;
        mod(a, b);
        if(b==1) {
            cout << a << '\n';
        } else {
            string res1 = to_string(a/b);
            string res2 = to_string(a%b);
            string res3 = to_string(b);
            for(int i=0;i<res1.size()+1;i++) cout << ' ';
            cout << a%b << '\n' << res1 << ' ';
            for(int i=0;i<max(res2.size(), res3.size());i++) cout << '-'; cout << '\n';
            for(int i=0;i<res1.size()+1;i++) cout << ' ';
            cout << b << '\n';
        }
    }
}