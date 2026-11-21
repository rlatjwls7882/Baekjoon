#include<bits/stdc++.h>
using namespace std;

struct work {
    int d, t;
    bool operator<(const work a) const {
        return t > a.t;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<work> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].d >> v[i].t;
    }
    sort(v.begin(), v.end());

    int last=INT_MAX;
    for(int i=0;i<n;i++) {
        last = min(last, v[i].t)-v[i].d;
    }
    cout << last;
}