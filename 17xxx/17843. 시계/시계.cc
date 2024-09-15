#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;

    cout << fixed;
    cout.precision(6);
    while(T-->0) {
        int h, m, s; cin >> h >> m >> s;
        vector<double> pos;
        pos.push_back(h/12.+m/(12.*60)+s/(12.*60*60));
        pos.push_back(m/60.+s/3600.);
        pos.push_back(s/60.);
        sort(pos.begin(), pos.end());

        cout << min(min(pos[1]-pos[0], pos[2]-pos[1]), pos[0]+1-pos[2])*360 << '\n';
    }
}