#include<bits/stdc++.h>
using namespace std;

const int MAX = 2001;

int g[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    for(int i=1;i<=n;i++) {
        set<int> grundies;
        grundies.insert(g[max(0, i-3)]);
        grundies.insert(g[max(0, i-4)]);
        for(int j=0;j<=i-5;j++) grundies.insert(g[j]^g[i-5-j]);

        for(int j=0;;j++) {
            if(!grundies.count(j)) {
                g[i]=j;
                break;
            }
        }
    }
    cout << (g[n] ? 1 : 2);
}