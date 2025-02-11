#include<bits/stdc++.h>
using namespace std;

struct pos {
    long long x, y, z;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<pos> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y >> v[i].z;

    int m; cin >> m;
    while(m--) {
        long long x, y, z, r; cin >> x >> y >> z >> r;

        int cnt=0;
        for(int i=0;i<n;i++) {
            if(pow(v[i].x-x, 2)+pow(v[i].y-y, 2)+pow(v[i].z-z, 2)<=r*r) {
                cnt++;
            }
        }
        cout << cnt << '\n';
    }
}