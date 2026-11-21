#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }
    sort(A, A+N, less<int>());

    int B[N];
    for(int i=0;i<N;i++) {
        cin >> B[i];
    }
    sort(B, B+N, greater<int>());

    int sum=0;
    for(int i=0;i<N;i++) {
        sum += A[i]*B[i];
    }
    cout << sum;
}