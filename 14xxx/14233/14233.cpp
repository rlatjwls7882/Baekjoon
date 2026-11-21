#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> time(n);
    for(int i=0;i<n;i++) cin >> time[i];
    sort(time.begin(), time.end());

    int maxT = INT_MAX;
    for(int i=0;i<n;i++) {
        maxT = min(maxT, time[i]/(i+1));
    }
    cout << maxT;
}