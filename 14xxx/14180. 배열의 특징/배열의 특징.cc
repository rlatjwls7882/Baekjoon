#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 200'001;

ll A[MAX], preSum[MAX];

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
    for(int i=1;i<=n;i++) {
        cin >> A[i];
        preSum[i] = preSum[i-1]+A[i];
    }

    ll res=0;
    vector<element> stk;
    for(int i=1;i<=n;i++) {
        ll x = A[i];
        element cur = {i, -preSum[i-1]};

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
        res = max(res, stk[left].a*x+stk[left].b + preSum[i-1]-i*A[i]);
    }

    stk.clear();
    for(int i=n;i>=1;i--) {
        ll x = -A[i];
        element cur = {-i, -preSum[i]};

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
        res = max(res, stk[left].a*x+stk[left].b + preSum[i]-i*A[i]);
    }
    for(int i=1;i<=n;i++) res += i*A[i];
    cout << res;
}