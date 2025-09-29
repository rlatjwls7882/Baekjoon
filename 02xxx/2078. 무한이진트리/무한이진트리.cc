#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b; cin >> a >> b;

    int cnt1=0, cnt2=0;
    while(a!=1 && b!=1) {
        if(a>b) {
            cnt1 += a/b;
            a%=b;
        } else {
            cnt2 += b/a;
            b%=a;
        }
    }
    cout << cnt1+a-1 << ' ' << cnt2+b-1;
}