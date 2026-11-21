#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int cnt[N+1] = {0, };

    for(int i=0;i<N-1;i++) {
        int a, b; cin >> a >> b;
        cnt[a]++;
        cnt[b]++;
    }

    int q; cin >> q;
    while(q-->0) {
        int t, k; cin >> t >> k;
        if(t==1) {
            if(cnt[k]>=2) {
                cout << "yes\n";
            } else {
                cout << "no\n";
            }
        } else {
            cout << "yes\n";
        }
    }
}