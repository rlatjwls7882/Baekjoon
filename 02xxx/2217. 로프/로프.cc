#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int w[N];
    for(int i=0;i<N;i++) {
        cin >> w[i];
    }
    sort(w, w+N);

    int maxW=0;
    for(int i=0;i<N;i++) {
        maxW = max(maxW, w[i]*(N-i));
    }
    cout << maxW;
}