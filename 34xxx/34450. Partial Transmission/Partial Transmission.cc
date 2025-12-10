#include<bits/stdc++.h>
using namespace std;

bool chk[1101];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, p; cin >> n >> p;
    for(int i=0;i<n-1;i++) {
        int s; cin >> s;
        chk[s]=true;
    }

    for(int i=p;;i++) {
        if(!chk[i]) {
            cout << i;
            return 0;
        }
    }
}