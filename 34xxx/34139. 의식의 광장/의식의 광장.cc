#include<bits/stdc++.h>
using namespace std;

struct light {
    int r, c, idx;
    bool operator<(const light l) const {
        return c < l.c;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int h, n; cin >> h >> n;
    vector<light> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].r >> v[i].c;
        v[i].idx = i;
    }
    sort(v.begin(), v.end());

    vector<int> res(n);
    for(int i=0;i<n;i++) res[v[i].idx]=i+1;

    cout << "YES\n";
    for(int e : res) cout << e << ' ';
}