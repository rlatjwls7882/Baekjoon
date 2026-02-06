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

int a[1000][1000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin >> a[i][j];

    int cnt=0;
    for(int i=0;i<n;i++) {
        int sum=0;
        for(int j=0;j<n;j++) {
            if(i!=j) sum += a[i][j];
        }
        if(a[i][i]>sum) cnt++;
        else if(a[i][i]<sum) return !(cout << "NO");
    }
    if(cnt) cout << "YES\n" << cnt;
    else cout << "NO";
}