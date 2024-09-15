#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, X; cin >> N >> X;

    int maxS=0;
    for(int i=1;i<=N;i++) {
        int S, T; cin >> S >> T;
        if(S+T<=X) {
            maxS = max(maxS, S);
        }
    }

    if(maxS) cout << maxS;
    else cout << -1;
}
