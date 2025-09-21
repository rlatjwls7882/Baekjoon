#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct pos {
    ll x, y;
};

ll getDist(pos a, pos b) {
    return (a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    vector<pos> a(3), b(3);
    for(int i=0;i<3;i++) cin >> a[i].x >> a[i].y;
    for(int i=0;i<3;i++) cin >> b[i].x >> b[i].y;

    vector<ll> aLen, bLen;
    for(int i=0;i<3;i++) aLen.push_back(getDist(a[i], a[(i+1)%3]));
    for(int i=0;i<3;i++) bLen.push_back(getDist(b[i], b[(i+1)%3]));
    sort(aLen.begin(), aLen.end());
    sort(bLen.begin(), bLen.end());

    if(aLen[0]*bLen[1] != aLen[1]*bLen[0] || aLen[1]*bLen[2] != aLen[2]*bLen[1]) cout << -1;
    else cout << fixed << setprecision(4) << sqrt((double)aLen[0]/bLen[0]);
}