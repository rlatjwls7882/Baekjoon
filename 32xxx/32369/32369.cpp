#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, A, B; cin >> N >> A >> B;

    int Good=1, Bad=1;
    while(N-->0) {
        Good += A;
        Bad += B;
        if(Good<Bad) swap(Good, Bad);
        if(Good==Bad) Bad--;
    }
    cout << Good << ' ' << Bad;
}