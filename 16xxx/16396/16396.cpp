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
        v.push_back(P(a, b));
    }
    sort(v.begin(), v.end(), comp);

    int sum=0, first=0, last=0;
    for(int i=0;i<n;i++) {
        if(last>v[i].first) {
            last = max(last, v[i].second);
        } else {
            sum += last-first;
            first = v[i].first;
            last = v[i].second;
        }
    }
    sum += last-first;
    cout << sum;
}