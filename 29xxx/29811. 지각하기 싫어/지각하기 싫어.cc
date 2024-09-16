#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    int a[n], b[m];
    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pqA, pqB;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        pqA.push({a[i], i+1});
    }
    for(int i=0;i<m;i++) {
        cin >> b[i];
        pqB.push({b[i], i+n+1});
    }

    int k; cin >> k;
    while(k-->0) {
        char ch; cin >> ch;
        if(ch=='U') {
            int x, y; cin >> x >> y;
            if(x<=n) {
                a[x-1]=y;
                pqA.push({y, x});
            } else {
                b[x-n-1]=y;
                pqB.push({y, x});
            }
        } else {
            while(a[pqA.top().second-1] != pqA.top().first) pqA.pop();
            while(b[pqB.top().second-n-1] != pqB.top().first) pqB.pop();
            cout << pqA.top().second << ' ' << pqB.top().second << '\n';
        }
    }
}