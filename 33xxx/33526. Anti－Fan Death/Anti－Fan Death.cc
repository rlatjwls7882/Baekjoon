#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    if(n==1) {
        cout << "ZNA\nNAZ\nAZN";
    } else {
        for(int i=0;i<3*n;i++) {
            for(int j=0;j<n;j++) {
                if(i<n) cout << "AZN";
                else if(i<2*n) cout << "ZNA";
                else cout << "NAZ";
            }
            cout << '\n';
        }
    }
}