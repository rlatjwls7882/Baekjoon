#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int X[N];
    for(int i=0;i<N;i++) {
        cin >> X[i];
    }
    int T[N];
    for(int i=0;i<N;i++) {
        cin >> T[i];
    }

    int minTime=0;
    for(int i=N-1;i>=0;i--) {
        minTime = max(minTime, max(X[i] + X[N-1]-X[i], T[i])+X[i]);
    }
    cout << minTime;
}