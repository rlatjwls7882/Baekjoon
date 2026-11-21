#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    int A, B, C, T; cin >> A >> B >> C >> T;
    cout << A + max(0, (T+B-31)/B*C);
}