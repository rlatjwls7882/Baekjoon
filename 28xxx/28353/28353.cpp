#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, K; cin >> N >> K;

    int w[N];
    for(int i=0;i<N;i++) {
        cin >> w[i];
    }
    sort(w, w+N);

    int firstIdx=0, lastIdx=N-1, cnt=0;
    while(firstIdx<lastIdx) {
        if(w[firstIdx]+w[lastIdx]>K) {
            lastIdx--;
        } else {
            cnt++;
            firstIdx++;
            lastIdx--;
        }
    }
    cout << cnt;
}