#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N, A, D; cin >> N >> A >> D;
        cout << N*(2*A+(N-1)*D)/2 << '\n';
    }
}