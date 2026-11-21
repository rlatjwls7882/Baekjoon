#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

bool comp1(P a, P b) {
    if(a.first==b.first) return a.second<b.second;
    return a.first<b.first;
}

bool comp2(P a, P b) {
    return a.second<b.second;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<P> v;
    for(int i=0;i<N;i++) {
        int A; cin >> A;
        v.push_back(P(A, i));
    }
    sort(v.begin(), v.end(), comp1);

    for(int i=0;i<N;i++) {
        v[i].first=i;
    }
    sort(v.begin(), v.end(), comp2);
    for(int i=0;i<N;i++) {
        cout << v[i].first << " ";
    }
}