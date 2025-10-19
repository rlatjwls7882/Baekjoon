#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct element {
    ll in, out, idx;
    bool operator<(const element e) const {
        if(in>=out) {
            if(e.in>=e.out) return out<e.out;
            return true;
        } else {
            if(e.in>=e.out) return false;
            if(in!=e.in) return in>e.in;
            return out>e.out;
        }
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<element> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].in >> v[i].out;
        v[i].idx=i+1;
    }
    sort(v.begin(), v.end());

    ll cur=0;
    for(auto e : v) {
        if(cur-e.out<0) {
            cout << "NEJ";
            return 0;
        }
        cur += e.in-e.out;
    }
    cout << "JA\n";
    for(auto e : v) cout << e.idx << ' ';
}