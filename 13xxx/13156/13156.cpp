#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int c, m; cin >> c >> m;

    int lastDp[c+1] = {0, };
    while(m-->0) {
        int nextDp[c+1]; memcpy(&nextDp, &lastDp, sizeof(lastDp));
        for(int i=1;i<=c;i++) {
            int p; cin >> p;
            for(int j=i;j<=c;j++) {
                nextDp[j] = max(nextDp[j], lastDp[j-i]+p);
            }
        }
        memcpy(&lastDp, &nextDp, sizeof(lastDp));
    }
    cout << lastDp[c];
}