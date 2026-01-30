#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

int l[2001], r[2001];

struct element {
    int a, b;
    bool operator<(const element e) const {
        if(a==e.a) return b>e.b;
        return a<e.a;
    }
};

int res(vector<int> &v) {
    vector<int> lis;
    for(int e:v) {
        if(lis.empty() || lis.back()<e) lis.push_back(e);
        else lis[lower_bound(lis.begin(), lis.end(), e)-lis.begin()]=e;
    }
    return lis.size();
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) {
        int a; cin >> a;
        l[a]=i+1;
    }
    for(int i=0;i<m;i++) {
        int b; cin >> b;
        r[b]=i+1;
    }

    vector<element> v;
    int k; cin >> k;
    for(int i=0;i<k;i++) {
        int a, b; cin >> a >> b;
        v.push_back({l[a], r[b]});
    }
    sort(v.begin(), v.end());

    vector<int> vv;
    for(auto e:v) vv.push_back(e.b);
    cout << k-res(vv);
}