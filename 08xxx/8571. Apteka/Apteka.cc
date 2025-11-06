#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 1'000'001;

ll c[MAX], dp[MAX];

struct element {
    ll a, b;
    double x=-1e150;
};

double meetX(element a, element b) {
    return (double)(a.b-b.b)/(b.a-a.a);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> c[i];

    vector<element> stk;
    for(int i=1;i<=n;i++) {
        ll x = c[i];
        element cur = {-(i-1), dp[i-1]};
        while(!stk.empty()) {
            cur.x = meetX(cur, stk.back());
            if(cur.x>stk.back().x) break;
            stk.pop_back();
        }
        stk.push_back(cur);

        int left=0, right=stk.size()-1;
        while(left<right) {
            int mid = left+right+1>>1;
            if(x<stk[mid].x) right = mid-1;
            else left = mid;
        }
        dp[i] = stk[left].a*x+stk[left].b + i*c[i];
    }
    cout << dp[n];
}