#include<bits/stdc++.h>
using namespace std;

int used[1'000'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;

    set<int> port;
    for(int i=1;i<=n;i++) {
        port.insert(i);
        used[i]=-1;
    }

    for(int tc=1;tc<=q;tc++) {
        int t, i; cin >> t >> i;
        if(t==1) {
            auto p = port.lower_bound(i);
            if(p!=port.end()) {
                cout << *p << '\n';
                port.erase(p);
                used[*p]=tc;
            } else {
                cout << "-1\n";
            }
        } else {
            cout << used[i] << '\n';
            port.insert(i);
            used[i]=-1;
        }
    }
}