#include<bits/stdc++.h>
using namespace std;

int a[101];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) cin >> a[i];
    while(m--) {
        int l, h; cin >> l >> h;
        bool chk=false;
        for(int i=1;i<=n;i++) {
            if(a[i]>a[h]) chk=true;
        }
        if(chk) a[l]--;
    }
    for(int i=1;i<=n;i++) cout << a[i] << ' ';
}