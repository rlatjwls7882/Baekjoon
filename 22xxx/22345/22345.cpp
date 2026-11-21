#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 200'002;

ll pos[MAX], a[MAX], cnt[MAX];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;
    vector<pair<ll, ll>> v(n);
    for(int i=0;i<n;i++) cin >> v[i].second >> v[i].first;
    sort(v.begin(), v.end());

    for(int i=0;i<n;i++) {
        pos[i+1] = v[i].first;
        cnt[i+1] = v[i].second+cnt[i];
        a[i+1] = v[i].second*pos[i+1]+a[i];
    }
    pos[0]=-1e9-1, pos[n+1]=1e9+1;
    a[n+1] = a[n];
    cnt[n+1] = cnt[n];

    while(q--) {
        int d; cin >> d;
        int cur = upper_bound(pos, pos+n+1, d)-pos-1;
        cout << cnt[cur]*d-a[cur] + a[n+1]-a[cur]-(cnt[n+1]-cnt[cur])*d << '\n';
    }
}