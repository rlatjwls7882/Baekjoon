#include<bits/stdc++.h>
using namespace std;

#define x first
#define y second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m, k; cin >> n >> m >> k;

    vector<vector<ld>> v(n);
    while(m--) {
        for(int i=0;i<n;i++) {
            ld a, b; cin >> a >> b;
            v[a-1].push_back(b);
        }
    }

    vector<ld> score;
    for(auto e:v) {
        sort(all(e), greater<ld>());
        score.push_back(e[0]);
    }
    sort(all(score), greater<ld>());

    ld res=0;
    for(int i=0;i<k;i++) res+=score[i];
    cout << setprecision(1) << fixed << res;
}