#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, w; cin >> n >> w;
    vector<tuple<int, int, int>> v;
    while(n--) {
        char c; int p; cin>>c>>p;
        if(c=='!') {
            int l,a;cin>>l>>a;
            v.push_back({p,l,a});
        } else {
            ll r=0;
            for(auto [a,b,c]:v) {
                if(p<a || p>a+b-1) continue;
                int d=(p-a)%4;
                if(d==0) r+=c;
                else if(d==2) r-=c;
            }
            cout << r << '\n';
        }
    }
}
