#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }

    int cnt=0;
    for(int i=1;i<N;i++) {
        if(A[i]<=A[i-1]) {
            cnt++;
            A[i]+=K;
        }
        if(A[i]<=A[i-1]) {
            cout << -1;
            return 0;
        }
    }
    cout << cnt;
}