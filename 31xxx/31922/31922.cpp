#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int A, P, C; cin >> A >> P >> C;
    cout << max(A+C, P);
}