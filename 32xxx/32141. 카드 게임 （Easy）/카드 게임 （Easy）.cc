#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, h; cin >> n >> h;
    int d[n];
    for(int i=0;i<n;i++) {
        cin >> d[i];
    }
    sort(d, d+n);

    int cnt=0;
    for(int i=0;i<n && h>0;i++) {
        h -= d[i];
        cnt++;
    }
    
    if(h>0) cout << -1;
    else cout << cnt;
}