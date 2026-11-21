#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 200'001;

ll preSum[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    for(int i=1;i<=n;i++) {
        cin >> preSum[i];
        preSum[i] += preSum[i-1];
    }

    set<int> reset; reset.insert(1);
    while(q--) {
        int x; cin >> x;
        if(x==1) {
            int d; cin >> d;
            reset.insert(d+1);
        } else {
            int s, e; cin >> s >> e;
            if(reset.size()) s = max(s, *(--reset.upper_bound(e)));
            cout << preSum[e] - preSum[s-1] << '\n';
        }
    }
}