#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, V; cin >> N >> M >> V;
    int C[N];
    for(int i=0;i<N;i++) {
        cin >> C[i];
    }

    while(M-->0) {
        int K; cin >> K;
        if(K<N) {
            cout << C[K] << '\n';
        } else {
            K-=V-1;
            K %= N-V+1;
            cout << C[K+V-1] << '\n';
        }
    }
}