#include<bits/stdc++.h>
using namespace std;

#define sz(x) (int)(x).size()
#define all(x) x.begin(), x.end()

typedef long long ll;
typedef vector<int> vi;
typedef vector<ll> vll;
typedef vector<vll> vvll;

const ll LINF = 0x3f3f3f3f3f3f3f3f;

struct Hungarian { // O(N^3)
    int n;
    vvll cost;
    vll row, col, slack;
    vi matchCol, prevCol, used;
    Hungarian(vvll& cost) : n(sz(cost)-1), cost(cost), row(n+1), col(n+1), matchCol(n+1), prevCol(n+1), slack(n+1), used(n+1) {}

    ll solve() {
        for(int i=1;i<=n;i++) {
            matchCol[0] = i;
            fill(all(slack), LINF);
            fill(all(used), 0);

            int j0=0;
            do {
                used[j0] = 1;
                int i0 = matchCol[j0], j1 = 0;
                ll delta = LINF;

                for(int j=1;j<=n;j++) {
                    if(!used[j]) {
                        ll cur = cost[i0][j] - row[i0] - col[j];
                        if(cur<slack[j]) slack[j] = cur, prevCol[j] = j0;
                        if(slack[j]<delta) delta = slack[j], j1 = j;
                    }
                }

                for(int j=0;j<=n;j++) {
                    if(used[j]) row[matchCol[j]] += delta, col[j] -= delta;
                    else slack[j] -= delta;
                }
                j0 = j1;
            } while(matchCol[j0]);

            do {
                int j1 = prevCol[j0];
                matchCol[j0] = matchCol[j1];
                j0 = j1;
            } while(j0);
        }
        return -col[0];
    }

    vi getMatching() {
        vi ret(n + 1);
        for (int j=1;j<=n;j++) ret[matchCol[j]] = j;
        return ret;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    vvll cost(n+1, vll(n+1));
    for(int i=1;i<=n;i++) for(int j=1;j<=n;j++) cin >> cost[i][j];
    Hungarian h(cost);
    cout << h.solve() << '\n';
}