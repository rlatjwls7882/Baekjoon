#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> diffs;
    for(int i=0;i<n;i++) {
        int a, b; cin >> a >> b;
        diffs.push_back(a-b);
    }
    sort(diffs.begin(), diffs.end());
    cout << abs(diffs[n/2] - diffs[(n-1)/2])+1;
}