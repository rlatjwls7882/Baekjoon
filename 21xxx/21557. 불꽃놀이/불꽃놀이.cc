#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }

    for(int i=0;i<N-2;i++) {
        if(i==N-3) {
            A[0]--;
            A[N-1]--;
        } else {
            if(A[0]>A[N-1]) {
                A[0]--;
            } else {
                A[N-1]--;
            }
        }
    }
    cout << max(A[0], A[N-1]);
}