#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b; cin >> a >> b;
    vector<int> v(a+b);
    for(int i=0;i<a+b;i++) cin >> v[i];

    sort(v.begin(), v.end());
    for(int e:v) cout << e << '\n';
}