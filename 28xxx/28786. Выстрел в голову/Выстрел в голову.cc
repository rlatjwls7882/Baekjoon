#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, a, b; cin >> n >> m >> a >> b;

    int t=n;
    while(n>0) {
        if(b*min(m, n)<=a) {
            n--;
            t+=b;
        } else {
            n-=m;
            t+=a;
        }
    }
    cout << t;
}