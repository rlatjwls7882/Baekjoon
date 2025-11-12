#include<bits/stdc++.h>
using namespace std;

bool chk[6];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int d; cin >> d;
        chk[d]=true;
    }

    for(int i=1;i<=5;i++) {
        if(!chk[i]) {
            cout << "YES";
            return 0;
        }
    }
    cout << "NO";
}