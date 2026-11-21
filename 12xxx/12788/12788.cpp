#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int M, K; cin >> M >> K;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    sort(A, A+N, greater<int>());

    int cnt=0, sum=0;
    for(int i=0;i<N && sum<M*K;i++) {
        sum += A[i];
        cnt++;
    }
    if(sum>=M*K) cout << cnt;
    else cout << "STRESS";
}