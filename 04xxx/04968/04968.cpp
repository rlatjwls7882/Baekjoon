#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int n, m; cin >> n >> m;
        if(n==0) break;

        int sumA=0, sumB=0;
        vector<int> a(n), b(m);
        for(int i=0;i<n;i++) cin >> a[i], sumA+=a[i];
        for(int i=0;i<m;i++) cin >> b[i], sumB+=b[i];

        int x=1000, y=1000;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(sumA-2*a[i]==sumB-2*b[j] && x+y>a[i]+b[j]) {
                    x=a[i];
                    y=b[j];
                }
            }
        }
        if(x==1000) cout << "-1\n";
        else cout << x << ' ' << y << '\n';
    }
}