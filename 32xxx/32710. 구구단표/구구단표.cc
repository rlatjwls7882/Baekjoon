#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    for(int i=2;i<=9;i++) {
        for(int j=1;j<=9;j++) {
            if(n==i || n==j || n==i*j) {
                cout << 1;
                return 0;
            }
        }
    }
    cout << 0;
}