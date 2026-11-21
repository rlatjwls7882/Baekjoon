#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll dp[100'001];
string ret[4] = {".00", ".25", ".50", ".75"};

struct element {
    ll a, b;
    double x=-1e150;
};

double meetX(element a, element b) {
    return (double)(a.b-b.b)/(b.a-a.a);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        vector<pair<int, int>> v;
        while(n--) {
            int x, h; cin >> x >> h;
            while(!v.empty() && h-x>=v.back().second-v.back().first) v.pop_back();
            if(v.empty() || x+h>v.back().first+v.back().second) v.push_back({x, h});
        }

        vector<element> stk;
        for(int i=1;i<=v.size();i++) {
            ll xi = v[i-1].first, yi = v[i-1].second;
            ll A = xi+yi, B = -xi+yi;
            ll x = 2*A;
            element cur = {B, B*B+dp[i-1]};
            while(!stk.empty()) {
                cur.x = meetX(cur, stk.back());
                if(cur.x>stk.back().x) break;
                stk.pop_back();
            }
            stk.push_back(cur);

            int left=0, right=stk.size()-1;
            while(left<right) {
                int mid = left+right+1>>1;
                if(x<stk[mid].x) right=mid-1;
                else left=mid;
            }
            dp[i] = stk[left].a*x+stk[left].b + A*A;
        }
        cout << dp[v.size()]/4 << ret[dp[v.size()]%4] << '\n';
    }
}