#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; string s; cin >> n >> s;

    int mv=1;
    for(char ch:s) {
        cout << char((ch-'A'+mv)%26+'A');
        mv = mv*2%26;
    }
}