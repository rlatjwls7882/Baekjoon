#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c, d; cin >> a >> b >> c >> d;

    vector<int> res;
    for(int i=1;i<=3;i++) {
        if(pow(a, i)+pow(b, i)+pow(c, i)==d) {
            res.push_back(i);
        }
    }
    if(res.size()==1) cout << res.front();
    else cout << -1;
}