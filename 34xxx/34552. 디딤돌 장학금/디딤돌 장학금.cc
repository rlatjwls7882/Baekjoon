#include<bits/stdc++.h>
using namespace std;

int m[11];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<=10;i++) cin >> m[i];
    int n; cin >> n;

    int total=0;
    while(n--) {
        int b, s; double l; cin >> b >> l >> s;
        if(s>=17 && l>=2) total += m[b];
    }
    cout << total;
}