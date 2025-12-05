#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n, x; cin >> n >> x;

    ll sum=0;
    for(int i=0;i<n;i++) {
        int a; cin >> a;
        sum+=a;
    }

    int cnt=0;
    while(sum/n<x) {
        sum+=100;
        n++;
        cnt++;
    }
    cout << cnt;
}