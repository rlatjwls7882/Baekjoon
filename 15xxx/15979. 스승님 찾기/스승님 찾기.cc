#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int M, N; cin >> M >> N;
    if(M==0 && N==0) {
        cout << 0;
    } else if(gcd(M, N)==1) {
        cout << 1;
    } else {
        cout << 2;
    }
}