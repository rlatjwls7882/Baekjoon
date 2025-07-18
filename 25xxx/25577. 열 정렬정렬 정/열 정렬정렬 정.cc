#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<pair<int, int>> arr(n); // {val, idx}
    for(int i=0;i<n;i++) {
        cin >> arr[i].first;
        arr[i].second = i;
    }
    sort(arr.begin(), arr.end());

    int cnt=0;
    for(int i=0;i<n;i++) {
        while(arr[i].second!=i) {
            swap(arr[i], arr[arr[i].second]);
            cnt++;
        }
    }
    cout << cnt;
}