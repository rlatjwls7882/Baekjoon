#include<bits/stdc++.h>
using namespace std;

struct Jewel {
    int M, V;
    bool operator<(const Jewel a) const {
        return this->V<a.V;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    vector<Jewel> v;
    for(int i=0;i<N;i++) {
        int M, V; cin >> M >> V;
        v.push_back({M, V});
    }
    sort(v.begin(), v.end(), [](auto a, auto b){return a.M<b.M;});

    int C[K];
    for(int i=0;i<K;i++) {
        cin >> C[i];
    }
    sort(C, C+K, less<int>());

    long long total=0;
    priority_queue<Jewel> pq;
    int jewelIdx=0;
    for(int i=0;i<K;i++) {
        while(jewelIdx<N && v[jewelIdx].M<=C[i]) {
            pq.push(v[jewelIdx]);
            jewelIdx++;
        }
        if(!pq.empty()) {
            total += pq.top().V; pq.pop();
        }
    }
    cout << total;
}