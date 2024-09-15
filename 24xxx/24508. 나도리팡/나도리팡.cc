#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; long long T; cin >> N >> K >> T;

    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    sort(A, A+N);

    int first=0, last=N-1;
    while(first<last) {
        int move = min(A[first], K-A[last]);

        A[first] -= move;
        A[last] += move;
        T -= move;
        if(A[first]==0) first++;
        if(A[last]==K) last--;
    }

    if(T>=0 && (A[first]==K || A[first]==0)) cout << "YES";
    else cout << "NO";
}