#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<pair<int, int>> v(N);
    for(int i=0;i<N;i++) cin >> v[i].first >> v[i].second;
    sort(v.begin(), v.end());

    int maxTime = INT_MAX;
    for(int i=0;i<N-1;i++) {
        int dist = v[i+1].first-v[i].first-1;
        int left = v[i].second/2;
        int right = v[i+1].second/2;
        if(left + right > dist) {
            if(left <= dist/2) maxTime = min(maxTime, dist-left);
            else if(right <= dist/2) maxTime = min(maxTime, dist-right);
            else maxTime = min(maxTime, dist/2);
        }
    }
    cout << (maxTime == INT_MAX ? "forever" : to_string(maxTime));
}