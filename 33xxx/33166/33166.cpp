#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int P, Q, A, B; cin >> P >> Q >> A >> B;
    cout << min(P, Q)*A + max(0, Q-P)*B;
}