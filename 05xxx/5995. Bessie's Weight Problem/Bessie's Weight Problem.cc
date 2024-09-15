#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int H, N; cin >> H >> N;

    int lastWeight[H+1] = {0, };
    while(N-->0) {
        int nextWeight[H+1]; memcpy(&nextWeight, &lastWeight, sizeof(lastWeight));
        int w; cin >> w;
        for(int i=w;i<=H;i++) {
            nextWeight[i] = max(nextWeight[i], nextWeight[i-w]+w);
        }
        memcpy(&lastWeight, &nextWeight, sizeof(lastWeight));
    }
    cout << lastWeight[H];
}