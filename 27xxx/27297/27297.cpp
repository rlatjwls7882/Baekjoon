#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    vector<vector<long long>> arr(n, vector<long long>(m));
    for(int i=0;i<m;i++) for(int j=0;j<n;j++) cin >> arr[j][i];

    long long cost=0;
    vector<long long> res(n);
    for(int i=0;i<n;i++) {
        sort(arr[i].begin(), arr[i].end());
        res[i] = arr[i][m/2];

        for(int j=0;j<m;j++) cost += abs(arr[i][j]-res[i]);
    }

    cout << cost << '\n';
    for(int i=0;i<n;i++) cout << res[i] << ' ';
}