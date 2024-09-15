#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    sort(A, A+N);

    int sum[N+1] = {0, };
    for(int i=0;i<N;i++) {
        sum[i+1] = sum[i]+A[i];
    }

    while(Q-->0) {
        int a, b; cin >> a >> b;
        cout << sum[b]-sum[a-1] << '\n';
    }
}