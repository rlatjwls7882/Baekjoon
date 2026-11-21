#include<bits/stdc++.h>
using namespace std;

bool comp(pair<int, int> a, pair<int, int> b) {
    return a.second < b.second;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    vector<pair<int, int>> list(k);
    for(int i=0;i<k;i++) cin >> list[i].first >> list[i].second; // {선호도, 도수}
    sort(list.begin(), list.end(), comp);

    long long sum=0;
    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
    for(int i=0;i<k;i++) {
        pq.push(list[i]);
        sum += list[i].first;
        if(pq.size()>n) {
            sum -= pq.top().first;
            pq.pop();
        }
        if(pq.size()==n && sum>=m) {
            cout << list[i].second;
            return 0;
        }
    }
    cout << -1;
}