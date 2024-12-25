#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int k, p, x; cin >> k >> p >> x;

        double minCost = x+k*p;
        for(double i=1;;i++) {
            double curCost = x*i+k/i*p;
            if(minCost<curCost) break;
            minCost = curCost;
        }
        cout << setprecision(3) << fixed << minCost << '\n';
    }
}