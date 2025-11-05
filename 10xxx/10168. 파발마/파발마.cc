#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 1'000'002;

bool exist[MAX];
// dp1[i]: 1부터 i번까지 시계 방향으로 움직였을 때의 최소 cost
// dp2[i]: i+1부터 N번까지 반시계 방향으로 움직였을 때의 최소 cost
ll preSum[MAX], dp1[MAX], dp2[MAX];

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
    for(int i=1;i<=n;i++) {
        cin >> exist[i];
        preSum[i] = preSum[i-1] + exist[i];
    }

    vector<element> stk;
    for(int i=1;i<=n;i++) {
        dp1[i] = dp1[i-1];
        if(exist[i]) {
            element cur = {-preSum[i-1], dp1[i-1]};
            while(!stk.empty()) {
                cur.x = meetX(cur, stk.back());
                if(cur.x>stk.back().x) break;
                stk.pop_back();
            }
            stk.push_back(cur);

            ll x = i;
            int left=0, right=stk.size()-1;
            while(left<right) {
                int mid = left+right+1>>1;
                if(x<stk[mid].x) right=mid-1;
                else left=mid;
            }
            dp1[i] = stk[left].a*x+stk[left].b + x*(preSum[i]+1);
        }
    }

    stk.clear();
    for(int i=n;i>=1;i--) {
        dp2[i] = dp2[i+1];
        if(exist[i]) {
            element cur = {preSum[i], dp2[i+1]};
            while(!stk.empty()) {
                cur.x = meetX(cur, stk.back());
                if(cur.x>stk.back().x) break;
                stk.pop_back();
            }
            stk.push_back(cur);

            ll x = n-i+1;
            int left=0, right=stk.size()-1;
            while(left<right) {
                int mid = left+right+1>>1;
                if(x<stk[mid].x) right=mid-1;
                else left=mid;
            }
            dp2[i] = stk[left].a*x+stk[left].b - x*(preSum[i-1]-1);
        }
    }
    ll res = LONG_LONG_MAX;
    for(int i=0;i<=n;i++) res = min(res, dp1[i]+dp2[i+1]);
    cout << res;
}