#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
ll preSum[1'000'001], dp[1'000'001];

struct element {
    ll a, b;
    double x=0;
};

double meetX(element a, element b) {
    return (double)(a.b-b.b)/(b.a-a.a);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n, a, b, c; cin >> n >> a >> b >> c;
    for(int i=1;i<=n;i++) {
        cin >> preSum[i];
        preSum[i] += preSum[i-1];
    }

    int left=0;
    vector<element> stk;
    for(int i=1;i<=n;i++) {
        ll X = preSum[i];
        ll Y = preSum[i-1];
        element cur = {-2*a*Y, dp[i-1]+a*Y*Y-b*Y};
        while(!stk.empty()) {
            cur.x = meetX(cur, stk.back());
            if(cur.x>stk.back().x) break;
            stk.pop_back();
        }
        stk.push_back(cur);
        left = min(left, (int)stk.size()-1);

        while(left+1<stk.size() && X>stk[left+1].x) left++;
        dp[i] = stk[left].a*X + stk[left].b + a*X*X+b*X+c;
    }
    cout << dp[n];
}