#include <bits/stdc++.h>
using namespace std;

long long N, P, Q, X, Y;
map<long long, long long> A;

long long find(long long i) {
    if(i<=0) return 1;
    if(A[i]) return A[i];
    return A[i] = find(i/P-X)+find(i/Q-Y);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> P >> Q >> X >> Y;
    cout << find(N);
}