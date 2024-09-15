#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n; cin >> n;
        if(n==0) break;

        int total=0;
        while(n-->0) {
            int a; cin >> a;
            if(total+a<=300) {
                total += a;
            }
        }
        cout << total << '\n';
    }
}