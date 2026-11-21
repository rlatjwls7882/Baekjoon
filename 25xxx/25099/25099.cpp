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
    int n; cin >> n;
    unordered_set<string> li;
    while(n--) {
        string s; cin >> s;
        string dup=s;
        sort(dup.begin(), dup.end());
        if(li.count(dup)) continue;
        li.insert(dup);
        cout << s << '\n';
    }
}