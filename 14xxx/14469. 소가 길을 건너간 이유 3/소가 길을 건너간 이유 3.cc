#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

bool comp(P a, P b) {
    return a.first<b.first;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    vector<P> v;
    for(int i=0;i<n;i++) {
        int a, b; cin >> a >> b;
        v.push_back(make_pair(a, b));
    }
    sort(v.begin(), v.end(), comp);

    int s=0, e=0;
    for(int i=0;i<n;i++) {
        if(e<v[i].first) {
            s=v[i].first;
            e=v[i].first+v[i].second;
        } else {
            e+=v[i].second;
        }
    }
    cout << e;
}