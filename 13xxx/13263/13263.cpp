#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;
const int MAX = 100'001;

ll a[MAX], b[MAX], dp[MAX];

struct element {
    ll a, b;
    ld x=1e-150;
};

ld meetX(element a, element b) {
    return (ld)(a.b-b.b)/(b.a-a.a);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> a[i];
    for(int i=1;i<=n;i++) cin >> b[i];

    vector<element> stk;
    for(int i=2;i<=n;i++) {
        ll x = a[i];
        element cur = {b[i-1], dp[i-1]};
        while(!stk.empty()) {
            cur.x = meetX(stk.back(), cur);
            if(cur.x>stk.back().x) break;
            stk.pop_back();
        }
        stk.push_back(cur);

        int l=0, r=stk.size()-1;
        while(l<r) {
            int mid = l+r+1>>1;
            if(x<=stk[mid].x) r=mid-1;
            else l=mid;
        }
        dp[i] = stk[l].a*x + stk[l].b;
    }
    cout << dp[n];
}