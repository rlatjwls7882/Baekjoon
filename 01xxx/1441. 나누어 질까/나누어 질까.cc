#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
ll n, l, r, cnt, a[18];

void back(int depth=0, int start=0, ll val=1) {
    if(val>r) return;
    if(depth) {
        if(depth%2) cnt += r/val - (l-1)/val;
        else cnt -= r/val - (l-1)/val;
    }
    for(int i=start;i<n;i++) back(depth+1, i+1, lcm(val, a[i]));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> l >> r;
    for(int i=0;i<n;i++) cin >> a[i];
    back();
    cout << cnt;
}