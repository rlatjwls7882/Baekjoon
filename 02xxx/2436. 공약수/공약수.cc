#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b; cin >> a >> b;

    int max = b/a;
    int val1=1, val2=max;
    for(int i=2;i*i<=max;i++) {
        if(max%i==0 && gcd(max/i, i)==1) {
            val1=i;
            val2=max/i;
        }
    }
    cout << a*val1 << ' ' << a*val2;
}