#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(i%2!=j%2) {
                cout << "? " << i+1 << ' ' << j+1 << '\n' << flush;
                int res; cin >> res;
                if(res==1) return 0;
            }
        }
    }
}