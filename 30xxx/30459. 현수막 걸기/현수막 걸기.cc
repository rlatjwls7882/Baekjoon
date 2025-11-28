#include<bits/stdc++.h>
using namespace std;

int a[2'000], b[40'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, r; cin >> n >> m >> r;
    for(int i=0;i<n;i++) cin >> a[i];
    sort(a, a+n);
    for(int i=0;i<m;i++) cin >> b[i];
    sort(b, b+m);

    double ret=-1;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            double mult = r/((a[j]-a[i])/2.0);
            int idx = upper_bound(b, b+m, mult)-b-1;
            if(idx>=0) ret = max(ret, (a[j]-a[i])/2.0*b[idx]);
        }
    }
    if(ret==-1) cout << -1;
    else cout << setprecision(1) << fixed << ret;
}