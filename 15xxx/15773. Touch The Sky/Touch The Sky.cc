#include<bits/stdc++.h>
using namespace std;

#define x first
#define y second
#define sz(x) (int)(x).size()
#define all(x) x.begin(), x.end()

typedef long long ll;
typedef pair<ll, ll> pll;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    vector<pll> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;
    sort(all(v), [](auto a, auto b) { return a.x+a.y < b.x+b.y; });

    ll cur=0;
    priority_queue<pll> pq;
    for(int i=0;i<n;i++) {
        if(v[i].x<cur) {
            if(pq.top().x>v[i].y) {
                cur+=-pq.top().x+v[i].y;
                pq.pop();
                pq.push({v[i].y, v[i].x});
            }
        } else {
            cur+=v[i].y;
            pq.push({v[i].y, v[i].x});
        }
    }
    cout << sz(pq);
}