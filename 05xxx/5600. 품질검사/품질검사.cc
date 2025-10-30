#include<bits/stdc++.h>
using namespace std;

int res[301];

struct element {
    int i, j, k, r;
    bool operator<(const element e) const {
        return r>e.r;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c, n; cin >> a >> b >> c >> n;
    vector<element> v(n);
    for(int i=0;i<n;i++) cin >> v[i].i >> v[i].j >> v[i].k >> v[i].r;
    sort(v.begin(), v.end());

    fill(res, res+a+b+c+1, 2);
    for(auto e:v) {
        if(e.r) {
            res[e.i]=res[e.j]=res[e.k]=1;
        } else {
            if(res[e.i]==1 && res[e.j]==1) res[e.k]=0;
            else if(res[e.i]==1 && res[e.k]==1) res[e.j]=0;
            else if(res[e.j]==1 && res[e.k]==1) res[e.i]=0;
        }
    }
    for(int i=1;i<=a+b+c;i++) cout << res[i] << '\n';
}