#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;

    int aScore=0, bScore=0;
    while(n--) {
        int a; cin >> a;
        aScore += !a;
    }
    while(m--) {
        int b; cin >> b;
        bScore += b;
    }
    cout << abs(aScore-bScore);
}