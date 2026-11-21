#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;
    vector<pair<int, int>> v;
    while(N-->0) {
        int a, b; cin >> a >> b;
        v.push_back({a, b});
    }

    long long sum=0;
    sort(v.begin(), v.end(), [](pair<int, int> a, pair<int, int> b) { return a.second > b.second; });
    sort(v.begin()+K, v.end(), [](pair<int, int> a, pair<int, int> b) { return a.first > b.first; });
    for(int i=0;i<K+M;i++) {
        sum += v[i].first;
    }
    cout << sum;
}