#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct element {
    ll a, b;
    bool operator<(const element e) const {
        if(a<b) {
            if(e.a<e.b) return a<e.a;
            return true;
        } else {
            if(e.a<e.b) return false;
            return b>e.b;
        }
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<element> v(n);
    for(int i=0;i<n;i++) cin >> v[i].a >> v[i].b;
    sort(v.begin(), v.end());

    ll cur=0;
    for(auto e : v) {
        if(cur-e.a<0) {
            cout << 0;
            return 0;
        }
        cur += e.b-e.a;
    }
    cout << 1;
}