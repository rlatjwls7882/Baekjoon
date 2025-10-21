#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    int tmp;
    for(int i=0;i<n-1;i++) cin >> tmp;

    set<int> exist;
    while(q--) {
        int c, v; cin >> c >> v;
        if(c==1) {
            exist.insert(v);
        } else {
            int minDist=INT_MAX;
            auto low = exist.lower_bound(v);
            if(low!=exist.begin()) minDist = min(minDist, v-*prev(low));
            if(low!=exist.end()) minDist = min(minDist, *low-v);
            cout << (minDist==INT_MAX ? -1 : minDist) << '\n';
        }
    }
}