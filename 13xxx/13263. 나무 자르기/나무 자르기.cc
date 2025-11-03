#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 100'001;

ll a[MAX], b[MAX], dp[MAX];

struct element {
    ll a, b;
    double x=0;
};

double meetX(element a, element b) {
    return (double)(a.b-b.b)/(b.a-a.a);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> a[i];
    for(int i=1;i<=n;i++) cin >> b[i];

    int left=0;
    vector<element> stk;
    for(int i=2;i<=n;i++) {
        element cur = {b[i-1], dp[i-1]};
        while(!stk.empty()) {
            cur.x = meetX(stk.back(), cur);
            if(cur.x>stk.back().x) break;
            stk.pop_back();
        }
        left = min(left, (int)stk.size()-1);
        stk.push_back(cur);

        while(left+1<stk.size() && a[i]>stk[left+1].x) left++;
        dp[i] = stk[left].a*a[i] + stk[left].b;
    }
    cout << dp[n];
}