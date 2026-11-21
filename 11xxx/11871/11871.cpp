#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int g=0;
    while(n--) {
        int p; cin >> p;
        if(p%2) g ^= (p+1)/2;
        else g ^= p/2-1;
    }
    cout << (g ? "koosaga" : "cubelover");
}