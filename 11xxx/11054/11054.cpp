#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(); cin.tie(); cout.tie();
    int N; cin >> N;

    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }

    int _max=1;
    int increasing[N]; fill(increasing, increasing+N, 1);
    int decreasing[N]; fill(decreasing, decreasing+N, 1);
    for(int i=1;i<N;i++) {
        for(int j=0;j<i;j++) {
            if(A[j]<A[i]) {
                increasing[i] = max(increasing[i], increasing[j]+1);
            }
            if(A[j]>A[i]) {
                decreasing[i] = max(max(decreasing[i], increasing[j]+1), decreasing[j]+1);
            }
            _max = max(max(_max, increasing[i]), decreasing[i]);
        }
    }
    cout << _max;
}