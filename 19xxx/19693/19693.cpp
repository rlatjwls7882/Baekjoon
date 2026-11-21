#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct SlopeTrick {
    priority_queue<ll> L;
    priority_queue<ll, vector<ll>, greater<>> R;
    ll addL=0, addR=0, ans=0;
    ll res() { return ans; }
    ll topL(){ return L.top()+addL; }
    ll topR(){ return R.top()+addR; }
    void pushL(ll x){ L.push(x-addL); }
    void pushR(ll x){ R.push(x-addR); }
    void addLeft(ll x){
        if(!R.empty() && topR()<x) ans+=x-topR(), pushL(topR()), R.pop(), pushR(x);
        else pushL(x);
    }
    void addRight(ll x){
        if(!L.empty() && x<topL()) ans+=topL()-x, pushR(topL()), L.pop(), pushL(x);
        else pushR(x);
    }
    void add_abs(ll x){
        addLeft(x);
        addRight(x);
    }
    void slide(ll l, ll r){
        addL-=l;
        addR+=r;
    }
};
SlopeTrick st;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n, h; cin >> n >> h;

    for(int i=0;i<n;i++) {
        ll s; cin >> s;
        st.slide(h, h);
        st.add_abs(s);
    }
    cout << st.res();
}