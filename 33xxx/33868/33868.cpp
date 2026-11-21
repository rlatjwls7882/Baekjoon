#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    
    int maxT=0, minB=INT_MAX;
    while(n--) {
        int t, b; cin >> t >> b;
        maxT = max(maxT, t);
        minB = min(minB, b);
    }
    cout << maxT*minB%7+1;
}