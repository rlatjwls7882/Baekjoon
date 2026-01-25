#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

int dp[100'001], pre[100'001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    int minLen=-1;
    for(int i=3;i<=n;i++) {
        set<int> mex;
        for(int len=2;len*(len+1)/2<=i;len++) {
            int cur = i-len*(len+1)/2;
            if(cur%len==0) {
                int l=1+cur/len, r=cur/len+len;
                int val = pre[r]^pre[l-1];
                mex.insert(val);
                if(!val && i==n && minLen==-1) minLen=len;
            }
        }
        for(int j=0;;j++) {
            if(!mex.count(j)) {
                dp[i]=j;
                break;
            }
        }
        pre[i]=pre[i-1]^dp[i];
    }
    cout << (dp[n] ? minLen : -1);
}