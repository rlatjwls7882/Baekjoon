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
    int n; cin >> n;
    int a=0, b=0, c=0;
    while(n--) {
        string x, y; int z; cin >> x >> y >> z;
        if(x=="STU") a+=(y=="IN" ? z : -z);
        else if(x=="VIS") b+=(y=="IN" ? z : -z);
        else c+=(y=="IN" ? z : -z);
    }
    if(a+b+c) cout << a+b+c;
    else cout << "NO STRAGGLERS";
}