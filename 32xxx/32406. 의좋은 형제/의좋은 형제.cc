#include<bits/stdc++.h>
using namespace std;

int a[200'001], b[200'001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> a[i];
    for(int i=1;i<=n;i++) cin >> b[i];

    int res=abs(a[n]+b[n-1]-(b[n]+a[n-1]));
    for(int i=1;i<n-1;i++) res+=abs(a[i]-b[i]);
    cout << res;
}