#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b, S; cin >> a >> b >> S;
    // S = (L-a)(L-b)
    for(int L=max(a, b)+1;L<=20000;L++) {
        if(S==(L-a)*(L-b)) {
            cout << L;
            return 0;
        }
    }
    cout << -1;
}