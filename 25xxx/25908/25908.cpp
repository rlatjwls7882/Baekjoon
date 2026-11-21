#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);

    int total=0, s, t; cin >> s >> t;
    for(int i=1;i<=t;i++) {
        int cnt = t/i - (s-1)/i;
        if(i%2==0) total += cnt;
        else total -= cnt;
    }
    cout << total;
}