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
    int h1, h2, m1, m2; char ch; cin >> h1 >> ch >> m1 >> h2 >> ch >> m2;
    m1+=h1*60;
    m2+=h2*60;
    cout << min((m1-m2+720)%720, (m2-m1+720)%720)*6;
}