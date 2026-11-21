#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<pair<int, int>> v;
    for(int i=0;i<N;i++) {
        int a, b; cin >> a >> b;
        v.push_back(make_pair(a, b));
    }
    sort(v.begin(), v.end(), greater<pair<int, int>>());

    long long sum=0;
    for(int i=0;i<N;i++) {
        sum += v[i].first*(long long)(N-i)+v[i].second;
    }
    cout << sum;
}