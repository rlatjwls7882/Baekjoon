#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll p[100'001], d[100'001];

struct element {
    ll sum, cnt;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        for(int i=1;i<=n;i++) cin >> p[i];
        int q; cin >> q;
        for(int i=1;i<=q;i++) cin >> d[i];

        ll idx=1;
        vector<element> stk;
        for(int i=1;i<=n;i++) {
            element cur = {p[i], 1};
            while(!stk.empty() && stk.back().sum*cur.cnt>cur.sum*stk.back().cnt) {
                cur.sum += stk.back().sum;
                cur.cnt += stk.back().cnt;
                stk.pop_back();
            }
            stk.push_back(cur);

            while(idx<=q && d[idx]==i+1) {
                cout << stk.back().cnt << ' ';
                idx++;
            }
        }
        cout << '\n';
    }
}