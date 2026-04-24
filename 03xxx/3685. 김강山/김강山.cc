#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct SlopeTrick {
    priority_queue<ll> L;
    priority_queue<ll, vector<ll>, greater<>> R;
    ll addL=0, addR=0, res=0;
    ll topL() { return L.top()+addL; }
    ll topR() { return R.top()+addR; }
    void pushL(ll x) { L.push(x-addL); }
    void pushR(ll x) { R.push(x-addR); }
    void addLeft(ll x) {
        if(!R.empty() && topR()<x) res+=x-topR(), pushL(topR()), R.pop(), pushR(x);
        else pushL(x);
    }
    void addRight(ll x) {
        if(!L.empty() && x<topL()) res+=topL()-x, pushR(topL()), L.pop(), pushL(x);
        else pushR(x);
    }
    void addAbs(ll x, int cnt=1) {
        while(cnt--) {
            addLeft(x);
            addRight(x);
        }
    }
    void slide(ll l, ll r) {
        addL+=l;
        addR+=r;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        ll n, d; cin >> n >> d;
        vector<ll> h(n);
        for(int i=0;i<n;i++) cin >> h[i];
        if(abs(h[n-1]-h[0])>(n-1)*d) {
            cout << "impossible\n";
            continue;
        }

        SlopeTrick st;
        st.addAbs(h[0], n+1);
        for(int i=1;i<n-1;i++) {
            st.slide(-d, d);
            st.addAbs(h[i]);
        }
        st.slide(-d, d);
        st.addAbs(h[n-1], n+1);
        cout << st.res << '\n';
    }
}