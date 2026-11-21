#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

const int INF = 0x3f3f3f3f;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, h; cin >> n >> h;
    ll r=0;
    while(n--) {
        int a,b,c;cin>>a>>b>>c;
        if(a>h&&b>h&&c>h) return !(cout << "impossible");
        int cur=INF;
        if(a<=h)cur=min({cur,b,c});
        if(b<=h)cur=min({cur,a,c});
        if(c<=h)cur=min({cur,a,b});
        r+=cur;
    }
    cout << r;
}
