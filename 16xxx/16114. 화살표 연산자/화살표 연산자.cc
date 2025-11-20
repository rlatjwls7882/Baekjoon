#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int x, n; cin >> x >> n;
    if(n==1) {
        x = -x;
        n=0;
    }
    if(n%2) return !(cout << "ERROR");
    if(n==0 && x>0) return !(cout << "INFINITE");

    int cnt=0;
    while((x-=n/2)>0) cnt++;
    cout << cnt;
}