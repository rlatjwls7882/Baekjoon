#include<bits/stdc++.h>
using namespace std;

struct element {
    int r, c, s;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, a, b; cin >> n >> a >> b;

    int res=0;
    vector<element> v(n);
    for(int i=0;i<n;i++) cin >> v[i].r >> v[i].c >> v[i].s;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            int l=min(v[i].c, v[j].c), r=max(v[i].c, v[j].c);
            int d=min(v[i].r, v[j].r), u=max(v[i].r, v[j].r);
            if(u-d>=a || r-l>=b) continue;

            int minV=min(v[i].s, v[j].s), maxV=max(v[i].s, v[j].s);
            for(int k=0;k<n;k++) {
                if(l<=v[k].c && v[k].c<=r && d<=v[k].r && v[k].r<=u) {
                    maxV = max(maxV, v[k].s);
                    minV = min(minV, v[k].s);
                }
            }
            res = max(res, maxV-minV);
        }
    }
    cout << res;
}