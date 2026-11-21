#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int a, b; char c; cin >> a >> c >> b;

        int cnt1=0, cnt2=0;
        for(int i=0;i<=9;i++) {
            for(int j=0;j<=9;j++) {
                if(a+i==b+j && i==b) continue;
                if(a+i>b+j || a+i==b+j && i>b) cnt1++;
                else cnt2++;
            }
        }
        cout << cnt1 << ' ' << cnt2 << '\n';
    }
}