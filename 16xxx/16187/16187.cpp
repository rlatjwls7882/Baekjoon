#include<bits/stdc++.h>
using namespace std;

int g[5001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);

    g[2]=1;
    for(int i=3;i<=5000;i++) {
        set<int> grundies;
        for(int j=0;j<=i-2;j++) grundies.insert(g[j]^g[i-2-j]);
        for(int j=0;;j++) {
            if(!grundies.count(j)) {
                g[i]=j;
                break;
            }
        }
    }

    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        cout << (g[n] ? "First\n" : "Second\n");
    }
}