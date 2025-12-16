#include<bits/stdc++.h>
using namespace std;

struct pos {
    int x, y;
    bool operator<(const pos p) const {
        if(x+y==p.x+p.y) return x-y>p.x-p.y;
        return x+y<p.x+p.y;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    vector<pos> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;
    sort(v.begin(), v.end());

    vector<int> stk;
    for(auto [x, y]:v) {
        int cur = x-y;
        if(stk.empty() || stk.back()<cur) stk.push_back(cur);
        else stk[lower_bound(stk.begin(), stk.end(), cur)-stk.begin()]=cur;
    }
    cout << stk.size();
}