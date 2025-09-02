#include<bits/stdc++.h>
using namespace std;

struct batting {
    int a, b;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    vector<batting> v(n);
    for(int i=0;i<n;i++) cin >> v[i].a >> v[i].b;

    while(m--) {
        int g, a, b; cin >> g >> a >> b;
        g -= a+b;

        int cnt=0;
        for(int i=0;i<n;i++) {
            if(v[i].a>=a && v[i].b>=b && v[i].a-a + v[i].b-b<=g) cnt++;
        }
        cout << cnt << '\n';
    }
}