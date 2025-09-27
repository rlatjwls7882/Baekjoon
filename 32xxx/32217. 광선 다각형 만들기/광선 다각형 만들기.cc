#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int total=0;
    for(int i=0;i<n;i++) {
        int theta; cin >> theta;
        total += theta*2;
    }
    cout << 180*(n-1) - total;
}