#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct element {
    int c, s, idx;
    bool operator<(const element e) const {
        return s<e.s;
    }
};

ll total, cnt[200'001], res[200'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<element> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].c >> v[i].s;
        v[i].idx=i;
    }
    sort(v.begin(), v.end());

    vector<element> stk;
    for(auto e:v) {
        if(!stk.empty() && stk.back().s<e.s) {
            while(!stk.empty()) {
                cnt[stk.back().c] += stk.back().s;
                total += stk.back().s;
                stk.pop_back();
            }
        }
        res[e.idx] = total-cnt[e.c];
        stk.push_back(e);
    }
    for(int i=0;i<n;i++) cout << res[i] << '\n';
}