#include<bits/stdc++.h>
using namespace std;

struct Pos {
    int x, y, num;
    bool operator<(const Pos a) const {
        return this->x < a.x;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int n; cin >> n;
        vector<Pos> v;
        for(int i=1;i<=3*n;i++) {
            int x, y; cin >> x >> y;
            v.push_back({x, y, i});
        }
        sort(v.begin(), v.end());

        for(int i=0;i<3*n;i+=3) {
            cout << v[i].num << ' ' << v[i+1].num << ' ' << v[i+2].num << '\n';
        }
    }
}