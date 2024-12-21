#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> v(n);
    for(int i=0;i<n;i++) cin >> v[i];

    for(int i=0;i<n;i++) {
        int cnt=0;
        for(int j=0;j<i;j++) if(v[j]<v[i]) cnt++;
        cout << cnt << '\n';
    }
}