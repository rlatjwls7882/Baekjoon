#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;

    int a[N+1] = {0, };
    for(int i=1;i<=N;i++) {
        cin >> a[i];
        a[i] = a[i]^a[i-1];
    }

    int totalXOR=0;
    while(Q-->0) {
        int s, e; cin >> s >> e;
        int curXOR=a[e]^a[s-1];
        totalXOR^=curXOR;
    }
    cout << totalXOR;
}