#include<bits/stdc++.h>
using namespace std;

int pre[200'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    for(int i=1;i<=n-1;i++) {
        cin >> pre[i];
        pre[i]^=pre[i-1];
    }

    while(q--) {
        int a, x, y; cin >> a >> x >> y;

        if(x==y) {
            if(a==1) {
                int d; cin >> d;
                cout << d << '\n';
            } else {
                cout << "0\n";
            }
        } else {
            int res = pre[x-1]^pre[y-1];
            if(a==1) {
                int d; cin >> d;
                res^=d;
            }
            cout << res << '\n';
        }
    }
}