#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 1'000'001;

ll pos[MAX], dp[MAX];

struct element {
    ll a, b;
    double x=-1e150;
};

double meetX(element a, element b) {
    return (double)(a.b-b.b)/(b.a-a.a);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        ll n, c; cin >> n >> c;
        if(!n) break;
        for(int i=1;i<=n;i++) cin >> pos[i];

        vector<element> stk;
        for(int i=1;i<=n;i++) {
            ll x = pos[i];
            element cur = {-2*pos[i], dp[i-1]+pos[i]*pos[i]};
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
            dp[i] = stk[left].a*x+stk[left].b + c+pos[i]*pos[i];
        }
        cout << dp[n] << '\n';
    }
}