#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, a, b, c, d, e, f, g, h; cin >> n >> a >> b >> c >> d >> e >> f >> g >> h;
    int x=-1, y, z;
    for(int i=0;i<=n;i++) {
        for(int j=0;i+j<=n;j++) {
            int k=n-i-j;
            if(a*i+b*j+c*k==d && e*i+f*j+g*k==h) {
                if(x!=-1) {
                    cout << 1;
                    return 0;
                }
                x=i; y=j; z=k;
            }
        }
    }
    if(x==-1) cout << 2;
    else cout << "0\n" << x << ' ' << y << ' ' << z;
}