#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct element {
    ll val, idx;
    bool operator<(const element e) const {
        return val > e.val;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<element> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].val;
        v[i].idx = i+1;
    }
    sort(v.begin(), v.end());

    ll r=1, maxVal=v[0].val*3, preSum=v[0].val;
    for(int i=1;i<n;i++) {
        preSum += v[i].val;
        if(maxVal < v[0].val+v[i].val+preSum) {
            maxVal = v[0].val+v[i].val+preSum;
            r=i+1;
        }
    }

    cout << r << '\n';
    for(int i=0;i<r;i++) cout << v[i].idx << ' ';
}