#include <bits/stdc++.h>
using namespace std;


int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    map<string, int> m;
    double cnt=0;
    while(true) {
        string s; getline(cin, s);
        if(cin.fail()) break;
        
        cnt++;
        if(m.count(s)) {
            m[s] = m[s]+1;
        } else {
            m.insert(make_pair(s, 1));
        }
    }

    cout << fixed; cout.precision(4);
    for(pair<string, int> P:m) {
        cout << P.first << ' ' << P.second/cnt*100 << '\n';
    }
}