#include<bits/stdc++.h>
using namespace std;

int res[301];

struct element {
    int i, j, k;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c, n; cin >> a >> b >> c >> n;

    vector<element> v;
    fill(res, res+a+b+c+1, 2);
    while(n--) {
        int i, j, k, r; cin >> i >> j >> k >> r;
        if(r) res[i]=res[j]=res[k]=1;
        else v.push_back({i, j, k});
    }

    for(auto e:v) {
        if(res[e.i]==1 && res[e.j]==1) res[e.k]=0;
        else if(res[e.i]==1 && res[e.k]==1) res[e.j]=0;
        else if(res[e.j]==1 && res[e.k]==1) res[e.i]=0;
    }
    for(int i=1;i<=a+b+c;i++) cout << res[i] << '\n';
}