#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll a[200'001], cnt[10'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int x, k; cin >> x >> k;
    for(int i=0;i<x;i++) cin >> a[i];

    for(int i=0;i<x;i++) {
        int color; cin >> color;
        cnt[color]++;
    }

    ll total=0;
    for(int i=0;i<x;i++) {
        total += x-cnt[a[i]];
    }
    cout << total;
}