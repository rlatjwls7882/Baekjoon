#include<bits/stdc++.h>
using namespace std;

bool comp(pair<string, int> a, pair<string, int> b) {
    return a.second<b.second;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K, L; cin >> K >> L;
    map<string, int> m;
    for(int i=0;i<L;i++) {
        string s; cin >> s;
        m[s]=i;
    }

    vector<pair<string, int>> v(m.begin(), m.end());
    sort(v.begin(), v.end(), comp);

    for(int i=0;i<K && i<v.size();i++) {
        cout << v[i].first << '\n';
    }
}