#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    // F[N] = 2(F[N-1] + F[N-2] + ... + F[0])
    // F[0] = 1
    int F[16] = {0, };
    F[0]=1;
    for(int i=1;i<=15;i++) {
        for(int j=0;j<i;j++) F[i] += F[j];
        F[i] *= 2;
    }
    int N; cin >> N;
    cout << F[N];
}