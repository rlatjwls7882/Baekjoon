#include<bits/stdc++.h>
using namespace std;

struct element {
    int t, s;
    bool operator<(const element e) const {
        return s > e.s;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<element> v(n);
    for(int i=0;i<n;i++) cin >> v[i].t >> v[i].s;
    sort(v.begin(), v.end());

    int last=1'000'000;
    for(element e : v) {
        last = min(last, e.s)-e.t;
    }
    cout << (last>=0 ? last : -1);
}