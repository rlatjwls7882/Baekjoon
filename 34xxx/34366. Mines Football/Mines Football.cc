#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int m; cin >> m;

    int r1=0, r2=INT_MAX, r3=0, r4=INT_MAX;
    while(m--) {
        int s; cin >> s;
        int sum=0;
        while(s--) {
            int cur; cin >> cur;
            sum+=cur;
            r1=max(r1, cur);
            r2=min(r2, cur);
        }
        r3=max(r3, sum);
        r4=min(r4, sum);
    }
    cout << r1 << '\n' << r2 << '\n' << r3 << '\n' << r4;
}