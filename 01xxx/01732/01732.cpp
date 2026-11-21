#include<bits/stdc++.h>
using namespace std;

struct pos {
    int x, y, gcdVal, z;
    bool operator<(const pos a) const {
        if(x/(double)y == a.x/(double)a.y) return gcdVal < a.gcdVal;
        return x/(double)y < a.x/(double)a.y;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<pos> v;
    while(n--) {
        int x, y, z; cin >> x >> y >> z;
        int gcdVal = gcd(x, y);
        v.push_back({x/gcdVal, y/gcdVal, gcdVal, z});
    }
    sort(v.begin(), v.end());

    vector<pair<int, int>> res;
    int lastX=0, lastY=0, lastZ=-1; 
    for(auto e:v) {
        if(lastX==e.x && lastY==e.y) {
            if(lastZ>=e.z) {
                res.push_back({e.x*e.gcdVal, e.y*e.gcdVal});
            } else {
                lastZ = e.z;
            }
        } else {
            lastX = e.x, lastY = e.y, lastZ = e.z;
        }
    }

    sort(res.begin(), res.end());
    for(auto e:res) cout << e.first << ' ' << e.second << '\n';
}