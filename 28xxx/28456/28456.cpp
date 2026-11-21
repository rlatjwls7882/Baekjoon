#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int A[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> A[i][j];
        }
    }

    int Q; cin >> Q;
    while(Q-->0) {
        int n; cin >> n;
        if(n==1) {
            int k; cin >> k; k--;
            int tmp = A[k][N-1];
            for(int i=N-1;i>0;i--) {
                A[k][i] = A[k][i-1];
            }
            A[k][0] = tmp;
        } else {
            int newA[N][N];
            for(int i=0;i<N;i++) {
                for(int j=0;j<N;j++) {
                    newA[i][j] = A[N-1-j][i];
                }
            }
            memcpy(&A, &newA, sizeof(A));
        }
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cout << A[i][j] << ' ';
        }
        cout << '\n';
    }
}