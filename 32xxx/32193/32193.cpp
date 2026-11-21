#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int a=0, b=0;
    while(N-->0) {
        int A, B; cin >> A >> B;
        a += A;
        b += B;
        cout << a-b << '\n';
    }
}