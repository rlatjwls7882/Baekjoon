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

string s[100];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> s[i];

    for(int i=0;i<n;i++) {
        vector<int> res;
        int cnt=0;
        for(int j=0;j<m;j++) {
            if(s[i][j]=='#') cnt++;
            else if(cnt!=0) {
                res.push_back(cnt);
                cnt=0;
            }
        }
        if(cnt) res.push_back(cnt);

        cout << res.size();
        for(int e:res) cout << ' ' << e;
        cout << '\n';
    }
    cout << '\n';

    for(int i=0;i<m;i++) {
        vector<int> res;
        int cnt=0;
        for(int j=0;j<n;j++) {
            if(s[j][i]=='#') cnt++;
            else if(cnt!=0) {
                res.push_back(cnt);
                cnt=0;
            }
        }
        if(cnt) res.push_back(cnt);

        cout << res.size();
        for(int e:res) cout << ' ' << e;
        cout << '\n';
    }
}