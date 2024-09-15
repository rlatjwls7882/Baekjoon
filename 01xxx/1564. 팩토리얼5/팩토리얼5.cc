#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1000000000000;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    long long fact=1;
    for(long long i=2;i<=N;i++) {
        fact *= i;
        while(fact%10==0) {
            fact/=10;
        }
        fact %= MOD;
    }
    fact %= 100000;

    for(int i=(int)log10(fact)+1;i<5;i++) {
        cout << 0;
    }
    cout << fact;
}