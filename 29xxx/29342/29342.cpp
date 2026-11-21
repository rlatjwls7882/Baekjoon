#include<bits/stdc++.h>
using namespace std;

long long cnt[2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int A; cin >> A;
        cnt[A%2]++;
    }
    cout << cnt[0]*cnt[1];
}