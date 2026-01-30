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

ld a[1000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    ld sum=0;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        sum += a[i];
    }
    sum/=n;

    int cnt=0;
    for(int i=0;i<n;i++) cnt += abs(sum-a[i])>10;
    cout << cnt;
}