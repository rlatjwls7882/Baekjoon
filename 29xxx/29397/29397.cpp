#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    string a, b; cin >> a >> b;

    int aa = (a[0]-'a')+(a[1]-'1');
    int bb = (b[0]-'a')+(b[1]-'1');
    cout << (aa%2==bb%2 ? "YES" : "NO");
}