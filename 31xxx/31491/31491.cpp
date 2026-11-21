#include<bits/stdc++.h>
using namespace std;

int inDegree[100'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, p; cin >> n >> p;
    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        inDegree[u]++;
        inDegree[v]++;
    }

    int leaf=0;
    for(int i=0;i<n;i++) leaf += inDegree[i]==1;

    if(p%leaf==0) cout << p/leaf*2;
    else if(p%leaf==1) cout << p/leaf*2+1;
    else cout << p/leaf*2+2;
}