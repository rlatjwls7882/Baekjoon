#include<bits/stdc++.h>
using namespace std;

int a[10];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    if(n==2) {
        cout << min(a[0], a[1])*2;
    } else {
        int ret=INT_MAX;
        for(int i=0;i<n;i++) ret = min(ret, a[i]+a[(i+2)%n]);
        cout << ret;
    }
}