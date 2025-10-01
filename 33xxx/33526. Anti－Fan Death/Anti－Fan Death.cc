#include<bits/stdc++.h>
using namespace std;

string s = "ZNA";

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<3*n;i++) {
        for(int j=0;j<3*n;j++) {
            if(j<n) cout << s[i/n];
            else if(j<2*n) cout << s[(i/n+1)%3];
            else cout << s[(i/n+2)%3];
        }
        cout << '\n';
    }
}