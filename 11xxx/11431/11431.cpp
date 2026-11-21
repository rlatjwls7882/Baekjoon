#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int k; cin >> k;
    for(int tc=1;tc<=k;tc++) {
        int n, s, p; cin >> n >> s >> p;

        int sum=0;
        int lx, ly; cin >> lx >> ly;
        while(n--) {
            int x, y; cin >> x >> y;
            sum += abs(lx-x) + abs(ly-y);
            lx = x;
            ly = y;
        }
        cout << "Data Set " << tc << ":\n" << (sum*s+p-1)/p << "\n\n";
    }
}