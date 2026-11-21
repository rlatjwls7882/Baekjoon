#include <bits/stdc++.h>

using namespace std;

bool compare(pair<int, int> p1, pair<int, int> p2) {
    if(p1.first==p2.first) {
        return p1.second<p2.second;
    } else {
        return p1.first>p2.first;
    }
}

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    vector<pair<int, int>> v;
    for(int i=0;i<N;i++) {
        int solve, penalty; cin >> solve >> penalty;
        v.push_back(make_pair(solve, penalty));
    }
    sort(v.begin(), v.end(), compare);

    int cnt=0;
    for(int i=5;i<N;i++) {
        if(v[4].first==v[i].first) {
            cnt++;
        }
    }
    cout << cnt;
}