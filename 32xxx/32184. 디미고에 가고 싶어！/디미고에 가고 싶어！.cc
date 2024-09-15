#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int A, B; cin >> A >> B;
    if(A%2==1) cout << 1+(B-A)/2;
    else cout << 1+(B-A+1)/2;
}