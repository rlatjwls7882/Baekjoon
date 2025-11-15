#include<bits/stdc++.h>
using namespace std;

int a[1'000'000], total[1<<17];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    for(int i=0;i<n;i++) cin >> a[i];

    long long cnt=0, right=0;
    while(right<=m) total[a[right++]]++;
    for(int i=0;i<n;i++) {
        total[a[i]]--;
        cnt += total[a[i]^k];
        if(right<n) total[a[right++]]++;
    }
    cout << cnt;
}