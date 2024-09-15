#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int S, K; cin >> S >> K;

    long long mul=1;
    for(int i=0;i<K;i++) {
        if(i<S%K) {
            mul *= S/K+1;
        } else {
            mul *= S/K;
        }
    }
    cout << mul;
}