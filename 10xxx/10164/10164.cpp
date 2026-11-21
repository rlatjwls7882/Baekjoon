#include<bits/stdc++.h>
using namespace std;

long long fact(int N) {
    long long res=1;
    for(int i=2;i<=N;i++) {
        res *= i;
    }
    return res;
}

long long C(int N, int K) {
    long long res=1;
    for(int i=N;i>N-K;i--) {
        res *= i;
    }
    return res;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;

    if(K==0) {
        cout << C(N+M-2, M-1)/fact(M-1);
    } else {
        int midN = (K-1)/M+1;
        int midM = (K-1)%M+1;
        cout << C(midN+midM-2, midM-1)/fact(midM-1) * C(N+M-midN-midM, M-midM)/fact(M-midM);
    }
}