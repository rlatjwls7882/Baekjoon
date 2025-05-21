#include<bits/stdc++.h>
using namespace std;

int cnt[] = {0, 7, 14, 21, 28, 35};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    long long total=35;
    for(int i=2;i<=n;i++) {
        total += cnt[2];
        total += cnt[4]*2;
        total += (i-2)*cnt[3];
        total += (i-2)*2*cnt[1];
    }
    cout << total;
}