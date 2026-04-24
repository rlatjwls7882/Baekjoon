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
SlopeTrick st;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    st.addAbs(0, n+1);
    for(int i=0;i<n;i++) {
        ll a, b; cin >> a >> b;
        st.slide(-b, a-b);
        st.addAbs(0);
    }
    st.addAbs(0, n+1);
    cout << st.res;
}