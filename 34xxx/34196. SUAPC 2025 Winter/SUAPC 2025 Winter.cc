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

int res[][13][2] = {
    {{1, 0}, {1, 0}, {1, 0}, {1, 2}, {0, 1}, {1, 0}, {1, 2}, {1, 0}, {1, 0}, {1, 3}, {1, 2}, {1, 1}, {1, 0}},
    {{1, 0}, {1, 1}, {1, 0}, {1, 0}, {0, 8}, {1, 0}, {1, 4}, {1, 3}, {1, 2}, {1, 0}, {1, 2}, {1, 3}, {1, 3}},
    {{1, 0}, {1, 0}, {1, 0}, {1, 1}, {0, 1}, {1, 0}, {0, 2}, {1, 3}, {1, 0}, {1, 0}, {1, 1}, {1, 1}, {1, 0}},
    {{1, 0}, {1, 0}, {1, 0}, {1, 3}, {0, 0}, {1, 0}, {0, 0}, {1, 0}, {1, 1}, {1, 0}, {1, 1}, {1, 1}, {1, 0}},
    {{1, 0}, {1, 1}, {1, 1}, {1, 0}, {0, 0}, {1, 0}, {0, 0}, {1, 6}, {1, 4}, {1, 0}, {1, 1}, {1, 0}, {1, 1}},
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(n--) {
        int r; char c; cin >> r >> c;
        int cc = c-'A';
        r--;
        if(res[r][cc][0]) cout << "Yes ";
        else cout << "No ";
        cout << res[r][cc][1] << '\n';
    }
}