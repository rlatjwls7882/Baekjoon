#include<bits/stdc++.h>
using namespace std;

int firstIdx[2001], lastIdx[2001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=2*n;i++) {
        int val; cin >> val;
        if(!firstIdx[val]) firstIdx[val]=i;
        else lastIdx[val]=i;
    }

    int maxDist=0;
    for(int i=1;i<=n;i++) {
        maxDist = max(maxDist, lastIdx[i]-firstIdx[i]-1);
    }
    cout << maxDist;
}