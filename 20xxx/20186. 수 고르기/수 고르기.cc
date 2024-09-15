#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

bool comp1(P a, P b) {
    return a.first>b.first;
}

bool comp2(P a, P b) {
    return a.second<b.second;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    vector<P> v;
    for(int i=0;i<N;i++) {
        int tmp; cin >> tmp;
        v.push_back(P(tmp, i));
    }
    sort(v.begin(), v.end(), comp1);

    vector<P> picked;
    for(int i=0;i<K;i++) {
        picked.push_back(v[i]);
    }
    sort(picked.begin(), picked.end(), comp2);

    int sum=0;
    for(int i=0;i<K;i++) {
        sum += picked[i].first-i;
    }
    cout << sum;
}