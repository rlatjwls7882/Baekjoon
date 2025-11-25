#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k, m; cin >> n >> k >> m;

    int lastS; cin >> lastS;
    while(m-->1) {
        int s; cin >> s;
        if(s-lastS>1 && s-lastS<=k+1) {
            cout << "NO";
            return 0;
        }
        lastS = s;
    }
    if(lastS<n && n-lastS<k+1) cout << "NO"; 
    else cout << "YES";
}