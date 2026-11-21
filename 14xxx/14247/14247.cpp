#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<long long> H(n), A(n);
    for(int i=0;i<n;i++) cin >> H[i];
    for(int i=0;i<n;i++) cin >> A[i];

    vector<pair<long long, long long>> tree(n);
    for(int i=0;i<n;i++) tree[i] = {A[i], H[i]};
    sort(tree.begin(), tree.end());

    long long len=0;
    for(int i=0;i<n;i++) len += tree[i].first*i + tree[i].second;
    cout << len;
}