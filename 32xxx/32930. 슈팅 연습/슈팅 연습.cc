#include<bits/stdc++.h>
using namespace std;

#define x first
#define y second

int sq(int x) { return x*x; }

int main() {
    int n, m; cin >> n >> m;
    
    int x=0, y=0, res=0;
    vector<pair<int, int>> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >>v[i].y;
    while(m--) {
        int idx=0, sz=0;
        for(int i=0;i<v.size();i++) {
            int cur = sq(x-v[i].x)+sq(y-v[i].y);
            if(sz<cur) {
                sz=cur;
                idx=i;
            }
        }
        x=v[idx].x;
        y=v[idx].y;
        res+=sz;
        v.erase(v.begin()+idx);
        int cx, cy; cin >> cx >> cy;
        v.push_back({cx, cy});
    }
    cout << res;
}