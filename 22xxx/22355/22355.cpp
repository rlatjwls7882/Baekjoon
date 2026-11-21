#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 100'001;

ll H[MAX], A[MAX], B[MAX], a[MAX], b[MAX];

void update(ll i, ll v1, ll v2) {
    while(i<MAX) {
        a[i]+=v1;
        b[i]+=v2;
        i+=i&-i;
    }
}

pair<ll, ll> query(int i) {
    ll ret1=0, ret2=0;
    while(i) {
        ret1+=a[i];
        ret2+=b[i];
        i-=i&-i;
    }
    return {ret1, ret2};
}

ll f(ll h) {
    auto q = query(h);
    return q.first*h+q.second;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    for(int i=0;i<n;i++) cin >> H[i];
    for(int i=0;i<n;i++) cin >> A[i];
    for(int i=0;i<n;i++) cin >> B[i];

    ll res=LONG_LONG_MAX;
    for(int i=0;i<n;i++) {
        update(1, -B[i], B[i]*H[i]);
        update(H[i], B[i], -B[i]*H[i]);
        update(H[i], A[i], -A[i]*H[i]);
        if(i>=k) {
            update(1, B[i-k], -B[i-k]*H[i-k]);
            update(H[i-k], -B[i-k], +B[i-k]*H[i-k]);
            update(H[i-k], -A[i-k], +A[i-k]*H[i-k]);
        }
        if(i+1>=k) {
            int l=1, r=MAX-1;
            while(l+2<r) {
                int p = (l*2+r)/3;
                int q = (l+r*2)/3;
                if(f(p)<=f(q)) r=q;
                else l=p;
            }
            while(l<=r) res = min(res, f(l++));
        }
    }
    cout << res;
}