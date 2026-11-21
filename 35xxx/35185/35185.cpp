#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int cnt[200'001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, l; string s; cin >> n >> l >> s;

    int x=1;
    for(char ch:s) {
        cnt[x]++;
        if(ch=='R' && x+1<=n) x++;
        else if(ch=='L' && x-1>=1) x--;
    }
    if(!cnt[x]) return !(cout << "WIN\n1 " << x);

    x=n;
    memset(cnt, 0, sizeof cnt);
    for(char ch:s) {
        cnt[x]++;
        if(ch=='R' && x+1<=n) x++;
        else if(ch=='L' && x-1>=1) x--;
    }
    if(!cnt[x]) return !(cout << "WIN\n" << n << ' ' << x);
    cout << "DEFEAT";
}