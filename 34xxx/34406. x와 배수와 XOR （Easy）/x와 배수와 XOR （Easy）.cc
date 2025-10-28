#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int x; cin >> x;
        if(!x) cout << "1\n2\n";
        else {
            int cnt=1;
            while(x) cnt<<=1, x>>=1;
            cout << "2\n" << cnt << ' ' << cnt+1 << '\n';
        }
    }
}