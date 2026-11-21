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

string s[101][100];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, w, h; cin >> n >> w >> h;
    for(int i=0;i<=n;i++) {
        for(int j=0;j<h;j++) {
            cin >> s[i][j];
        }
    }

    int res=0, idx=1;
    for(int i=0;i<n;i++) {
        int cnt=0;
        for(int j=0;j<h;j++) {
            for(int k=0;k<w;k++) {
                if(s[i][j][k]==s[n][j][k]) cnt++;
            }
        }
        if(cnt>res) {
            res=cnt;
            idx=i+1;
        }
    }
    cout << idx;
}