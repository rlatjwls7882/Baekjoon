#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 100'001;

// dp[i][j] : j까지 총 i번 잘랐을 때 최대 점수
int trace[201][MAX];
ll preSum[MAX], dp[2][MAX];

struct element {
    ll a, b, idx;
    double x=-1e150;
};

double meetX(element a, element b) {
    return (double)(a.b-b.b)/(b.a-a.a);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    for(int i=1;i<=n;i++) {
        cin >> preSum[i];
        preSum[i] += preSum[i-1];
    }

    for(int i=1;i<=k;i++) {
        vector<element> stk;
        for(int j=i;j<=n;j++) {
            ll x = preSum[j];
            element cur = {preSum[j], dp[(i-1)%2][j]-preSum[j]*preSum[j], j};
            while(!stk.empty()) {
                if(cur.a==stk.back().a) {
                    cur.b = max(cur.b, stk.back().b);
                } else {
                    cur.x = meetX(cur, stk.back());
                    if(cur.x>stk.back().x) break;
                }
                stk.pop_back();
            }
            stk.push_back(cur);

            int left=0, right=stk.size()-1;
            while(left<right) {
                int mid = left+right+1>>1;
                if(x<stk[mid].x) right=mid-1;
                else left=mid;
            }
            dp[i%2][j] = stk[left].a*x+stk[left].b;
            trace[i][j] = stk[left].idx;
        }
    }
    cout << dp[k%2][n] << '\n';
    while(k) {
        n = (trace[k][n]==n ? n-1 : trace[k][n]);
        cout << n << ' ';
        k--;
    }
}