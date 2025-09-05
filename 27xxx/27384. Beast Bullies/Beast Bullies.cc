#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> v(n);
    for(int i=0;i<n;i++) cin >> v[i];
    sort(v.begin(), v.end());
    
    ll attackIdx=n-1, attacker=v[n-1], defender=0;
    for(int i=n-2;i>=0;i--) {
        defender += v[i];
        if(defender>=attacker) {
            attacker += defender;
            defender=0;
            attackIdx=i;
        }
    }
    cout << n-attackIdx;
}