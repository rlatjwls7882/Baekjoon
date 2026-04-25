#include<bits/stdc++.h>
using namespace std;
#define x first
#define y second
typedef long long ll;
typedef pair<ll, ll> pll;
const int MAX = 1'000'001;
ll a[MAX], l[MAX], r[MAX], used[MAX];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    priority_queue<pll> pq;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        l[i]=(i-1+n)%n;
        r[i]=(i+1)%n;
        pq.push({a[i], i});
    }

    ll res=0;
    while(k--) {
        while(!pq.empty() && (used[pq.top().y] || a[pq.top().y]!=pq.top().x)) pq.pop();
        auto [v, i] = pq.top(); pq.pop();
        res+=a[i];
        a[i]=a[l[i]]+a[r[i]]-a[i];
        used[l[i]]=used[r[i]]=true;
        l[i]=l[l[i]];
        r[i]=r[r[i]];
        r[l[i]]=l[r[i]]=i;
        pq.push({a[i], i});
    }
    cout << res;
}