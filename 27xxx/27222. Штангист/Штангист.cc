#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> v(n);
    for(int i=0;i<n;i++) cin >> v[i];

    int sum=0;
    for(int i=0;i<n;i++) {
        int s, e; cin >> s >> e;
        if(v[i]) sum += max(0, e-s);
    }
    cout << sum;
}