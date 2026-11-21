#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct element {
    ll plus, minus;
    bool operator<(const element e) const {
        if(plus>minus) {
            if(e.plus>e.minus) return minus<e.minus;
            return true;
        } else {
            if(e.plus>e.minus) return false;
            return plus>e.plus;
        }
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<element> v(n);
    for(int i=0;i<n;i++) cin >> v[i].minus >> v[i].plus;
    sort(v.begin(), v.end());

    ll buy=0, cur=0;
    for(auto e:v) {
        if(cur-e.minus<0) {
            buy += e.minus-cur;
            cur = e.minus;
        }
        cur += e.plus-e.minus;
    }
    cout << buy;
}