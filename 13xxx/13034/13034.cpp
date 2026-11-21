#include<bits/stdc++.h>
using namespace std;

int g[1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=2;i<=n;i++) {
        set<int> s;
        for(int j=0;j<=i-2;j++) s.insert(g[j]^g[i-2-j]);
        for(int j=0;;j++) {
            if(!s.count(j)) {
                g[i]=j;
                break;
            }
        }
    }
    cout << (g[n] ? 1 : 2);
}