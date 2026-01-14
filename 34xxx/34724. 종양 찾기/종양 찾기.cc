#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

string s[1000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> s[i];

    for(int i=0;i<n-1;i++) {
        for(int j=0;j<m-1;j++) {
            if(s[i][j]=='1' && s[i+1][j]=='1' && s[i][j+1]=='1' && s[i+1][j+1]=='1') {
                return !(cout << 1);
            }
        }
    }
    cout << 0;
}