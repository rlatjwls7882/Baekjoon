#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Mw, Mb, Tw, Tb, Pw, Pb; cin >> Mw >> Mb >> Tw >> Tb >> Pw >> Pb;
    int A = min({Mw, Tb, Pw});
    int B = min({Mb, Tw, Pb});
    cout << min(A, B)+min(max(A, B), min(A, B)+1);
}