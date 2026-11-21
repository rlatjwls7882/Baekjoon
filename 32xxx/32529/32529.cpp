#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int A[N];
    for(int i=0;i<N;i++) cin >> A[i];

    int sum=0;
    for(int i=N-1;i>=0;i--) {
        sum += A[i];
        if(sum>=M) {
            cout << i+1;
            return 0;
        }
    }
    cout << -1;
}