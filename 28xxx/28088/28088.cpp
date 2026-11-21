#include<bits/stdc++.h>
using namespace std;

bool hi[200], nextHi[200];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    while(m--) {
        int num; cin >> num;
        hi[num]=true;
    }

    while(k--) {
        memset(nextHi, 0, sizeof nextHi);
        for(int i=0;i<n;i++) nextHi[i] = hi[(i-1+n)%n] != hi[(i+1)%n];
        memcpy(hi, nextHi, sizeof hi);
    }
    cout << accumulate(hi, hi+n, 0);
}