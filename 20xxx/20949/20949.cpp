#include<bits/stdc++.h>
using namespace std;

bool comp(pair<int, int> a, pair<int, int> b) {
    if(a.first!=b.first) return a.first>b.first;
    return a.second<b.second;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<pair<int, int>> v;
    for(int i=1;i<=N;i++) {
        int W, H; cin >> W >> H;
        v.push_back(make_pair(W*W+H*H, i));
    }
    sort(v.begin(), v.end(), comp);

    for(int i=0;i<N;i++) {
        cout << v[i].second << '\n';
    }
}