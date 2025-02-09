#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int x, k, h; cin >> x >> k >> h;
        k -= h;

        int total = (h*2 + min(140, k) + max(0, k-140)*1.5)*x;

        string ret = to_string(total);
        for(int i=ret.length()-3;i>0;i-=3) {
            ret.insert(ret.begin()+i, ',');
        }
        cout << ret << '\n';
    }
}