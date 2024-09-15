#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    int A[N+1]; A[0]=0;
    for(int i=1;i<=N;i++) {
        cin >> A[i];
    }
    sort(A, A+N+1);

    int diff[N];
    for(int i=0;i<N;i++) {
        diff[i] = A[i+1]-A[i];
    }
    sort(diff, diff+N, greater<int>());

    int cnt=0;
    for(int i=K;i<N;i++) {
        cnt += diff[i];
    }
    cout << cnt;
}