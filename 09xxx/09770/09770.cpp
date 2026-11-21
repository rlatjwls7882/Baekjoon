#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    vector<int> v;
    while(true) {
        int x; cin >> x;
        if(cin.fail()) break;
        v.push_back(x);
    }

    int res=0;
    for(int i=0;i<v.size();i++) {
        for(int j=i+1;j<v.size();j++) {
            res = max(res, gcd(v[i], v[j]));
        }
    }
    cout << res;
}