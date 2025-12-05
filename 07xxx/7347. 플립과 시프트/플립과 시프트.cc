#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;

        int odd=0, even=0;
        for(int i=0;i<n;i++) {
            int a; cin >> a;
            if(i%2) odd += a;
            else even += a;
        }
        cout << (n%2 || abs(odd-even)<=1 ? "YES\n" : "NO\n");
    }
}