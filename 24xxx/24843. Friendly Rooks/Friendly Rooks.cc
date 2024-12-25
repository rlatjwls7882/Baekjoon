#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    if(min(n, m)>=k) {
        cout << "Possible\n";
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(i==j && k>0) {
                    cout << '*';
                    k--;
                } else {
                    cout << '.';
                }
            }
            cout << '\n';
        }
    } else {
        cout << "Impossible";
    }
}