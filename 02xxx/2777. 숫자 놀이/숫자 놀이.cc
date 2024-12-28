#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int len=0;
        for(int i=9;i>=2;i--) {
            while(n%i==0) {
                len++;
                n/=i;
            }
        }
        if(n>1) cout << "-1\n";
        else cout << max(1, len) << '\n';
    }
}