#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    set<int> id, salespoint;
    map<pair<int, int>, int> total;
    while(n--) {
        int q, s, v; cin >> q >> s >> v;
        id.insert(q);
        salespoint.insert(s);
        total[{q, s}] += v;
    }

    cout << "-1 ";
    for(int q : id) cout << q << ' '; cout << '\n';
    for(int s : salespoint) {
        cout << s;
        for(int q : id) cout << ' ' << total[{q, s}];
        cout << '\n';
    }
}