#include<bits/stdc++.h>
using namespace std;

struct element {
    int x, y, idx;
    bool operator<(const element e) const {
        if(x!=e.x) return x<e.x;
        return y<e.y;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<element> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].x >> v[i].y;
        v[i].idx=i+1;
    }
    sort(v.begin(), v.end());

    for(int i=1;i<n;i++) cout << v[i-1].idx << ' ' << v[i].idx << '\n';
}