#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int res=1;
    while(n--) {
        int a, b; cin >> a >> b;
        res += b-a;
        if(a*b<0) res += (a<b ? -1 : 1);
    }
    cout << (res<=0 ? res-1 : res);
}