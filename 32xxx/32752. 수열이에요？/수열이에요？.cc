#include<bits/stdc++.h>
using namespace std;

int a[100'000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, l, r; cin >> n >> l >> r;
    for(int i=0;i<n;i++) cin >> a[i];
    sort(a+l-1, a+r);

    for(int i=1;i<n;i++) {
        if(a[i-1]>a[i]) return !(cout << 0);
    }
    cout << 1;
}