#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    while(true) {
        int n; cin >> n;
        if(!n) break;

        int res=0;
        for(int i=1;i<=n;i++) for(int j=1;j<=n;j++) res+=i*j;
        cout << res << '\n';
    }
}