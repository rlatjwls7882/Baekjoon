#include<bits/stdc++.h>
using namespace std;

int gcd(int a, int b) {
    while(b!=0) {
        int tmp = a%b;
        a=b;
        b=tmp;
    }
    return a;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, S; cin >> N >> S;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    
    int _gcd = abs(S-A[0]);
    for(int i=1;i<N;i++) {
        _gcd = gcd(_gcd, abs(S-A[i]));
    }
    cout << _gcd;
}