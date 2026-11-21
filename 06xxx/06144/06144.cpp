#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, M; cin >> N >> M;

    int lastDp[M+1] = {0, };
    while(N-->0) {
        int W, D; cin >> W >> D;

        int nextDp[M+1];
        int size = sizeof(nextDp);
        memcpy(&nextDp, &lastDp, size);

        for(int j=W;j<=M;j++) {
            nextDp[j] = max(nextDp[j], lastDp[j-W]+D);
        }
        memcpy(&lastDp, &nextDp, size);
    }
    cout << lastDp[M];
}