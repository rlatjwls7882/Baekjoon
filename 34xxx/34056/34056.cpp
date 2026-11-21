#include<bits/stdc++.h>
using namespace std;

long long d[200'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> d[i];

    int q; cin >> q;
    while(q--) {
        int op; cin >> op;
        if(op==1) {
            int c, x; cin >> c >> x;

            long long remain = x;
            for(int i=c;i>=1 && remain>0;i--) {
                long long cur = min(remain, d[i]);
                remain -= cur;
                d[i] += cur;
            }

            remain = x;
            for(int i=c+1;i<=n && remain>0;i++) {
                long long cur = min(remain, d[i]);
                remain -= cur;
                d[i] += cur;
            }
        } else {
            int c; cin >> c;
            cout << d[c] << '\n';
        }
    }
}