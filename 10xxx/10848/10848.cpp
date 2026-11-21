#include<bits/stdc++.h>
using namespace std;

#define x first
#define y second
#define sz(x) (int)(x).size()
#define all(x) x.begin(), x.end()

typedef long long ll;
typedef pair<ll, ll> pll;

const ll LINF = 0x3f3f3f3f3f3f3f3f;

ll sumL, sumR;
priority_queue<ll> L;
priority_queue<ll, vector<ll>, greater<>> R;

void add(ll x) {
    if(L.empty() || L.top()>=x) L.push(x), sumL+=x;
    else R.push(x), sumR+=x;
    while(L.size()<R.size()) {
        ll x = R.top(); R.pop();
        L.push(x);
        sumL+=x;
        sumR-=x;
    }
    while(L.size()>R.size()+1) {
        ll x = L.top(); L.pop();
        R.push(x);
        sumL-=x;
        sumR+=x;
    }
}

ll cost() {
    return L.top()*sz(L)-sumL+sumR-L.top()*sz(R);
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int k, n; cin >> k >> n;

    ll res=0;
    vector<pll> v;
    while(n--) {
        char p, q; int s, t; cin >> p >> s >> q >> t;
        if(p==q) res+=abs(s-t);
        else {
            res++;
            v.push_back({s, t});
        }
    }
    sort(all(v), [](auto a, auto b) { return a.x+a.y < b.x+b.y; });

    if(v.empty()) {
        cout << res;
        return 0;
    }

    if(k==1) {
        for(auto [s, t]:v) add(s), add(t);
        cout << res+cost();
        return 0;
    }

    L={}; R={};
    sumL=sumR=0;
    vector<ll> resL(sz(v)+1);
    for(int i=0;i<sz(v);i++) {
        add(v[i].x); add(v[i].y);
        resL[i+1]=cost();
    }

    L={}; R={};
    sumL=sumR=0;
    vector<ll> resR(sz(v)+1);
    for(int i=sz(v)-1;i>=0;i--) {
        add(v[i].x); add(v[i].y);
        resR[i]=cost();
    }

    ll best=LINF;
    for(int i=0;i<=sz(v);i++) best=min(best, resL[i]+resR[i]);
    cout << res+best;
}