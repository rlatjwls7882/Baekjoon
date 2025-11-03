#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll dp[50'001];

struct element {
    ll a, b;
    double x=0;
};

struct block {
    ll w=0, h=0;
    bool operator<(const block b) const {
        if(w!=b.w) return w>b.w;
        return h>b.h;
    }
};

double meetX(element a, element b) {
    return (double)(a.b-b.b)/(b.a-a.a);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<block> v(n);
    for(int i=0;i<n;i++) cin >> v[i].w >> v[i].h;
    sort(v.begin(), v.end());

    vector<block> merged(1);
    for(int i=0;i<n;i++) {
        if(!merged.empty() && merged.back().h>=v[i].h) continue;
        merged.push_back(v[i]);
    }

    vector<element> stk;
    for(int i=1;i<merged.size();i++) {
        element cur = {merged[i].w, dp[i-1]};
        while(!stk.empty()) {
            cur.x = meetX(stk.back(), cur);
            if(cur.x>stk.back().x) break;
            stk.pop_back();
        }
        stk.push_back(cur);

        int left=0, right=stk.size()-1;
        while(left<right) {
            int mid = left+right+1>>1;
            if(merged[i].h<stk[mid].x) right=mid-1;
            else left=mid;
        }
        dp[i] = stk[left].a*merged[i].h + stk[left].b;
    }
    cout << dp[merged.size()-1];
}