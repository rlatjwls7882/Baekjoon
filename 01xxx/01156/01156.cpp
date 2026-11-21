#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll d, n1, n2, c1, c2, tc;
ll cnt[100'000];

ll f(ll t) {
    ll cost=tc*t - min(c1, c2)*t;
    deque<pair<int, ll>> cant, fast, lazy;
    lazy.push_back({-d, t});

    for(int i=0;i<d;i++) {
        cant.push_back({i, cnt[i]});
        while(cant.size() && cant.front().first<=i-n1) fast.push_back(cant.front()), cant.pop_front();
        while(fast.size() && fast.front().first<=i-n2) lazy.push_back(fast.front()), fast.pop_front();
        ll remain = cnt[i];
        while(remain && fast.size() && c1<c2) {
            ll cur = min(remain, fast.back().second);
            remain-=cur;
            fast.back().second-=cur;
            cost+=cur*c1;
            if(!fast.back().second) fast.pop_back();
        }
        while(remain && lazy.size()) {
            ll cur = min(remain, lazy.back().second);
            remain-=cur;
            lazy.back().second-=cur;
            cost+=cur*c2;
            if(!lazy.back().second) lazy.pop_back();
        }
        while(remain && fast.size()) {
            ll cur = min(remain, fast.back().second);
            remain-=cur;
            fast.back().second-=cur;
            cost+=cur*c1;
            if(!fast.back().second) fast.pop_back();
        }
        if(remain) return LONG_LONG_MAX;
    }
    return cost;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> d >> n1 >> n2 >> c1 >> c2 >> tc;
    if(n1>n2) { // n1이 빠른거
        swap(n1, n2);
        swap(c1, c2);
    }

    ll l=0, r=0;
    for(int i=0;i<d;i++) {
        cin >> cnt[i];
        l = max(l, cnt[i]);
        r += cnt[i];
    }

    while(l+2<r) {
        ll p = (l*2+r)/3;
        ll q = (l+r*2)/3;
        if(f(p)<f(q)) r=q;
        else l=p;
    }

    ll res=LONG_LONG_MAX;
    while(l<=r) res = min(res, f(l++));
    cout << res;
}