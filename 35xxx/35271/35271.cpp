#include<bits/stdc++.h>
using namespace std;

int rem[101];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=m;i++) cin >> rem[i];
    while(n--) {
        int a, b, c; cin >> a >> b >> c;
        if(rem[a]) {
            rem[a]--;
            cout << a << " ";
        } else if(rem[b]) {
            rem[b]--;
            cout << b << " ";
        } else if(rem[c]) {
            rem[c]--;
            cout << c << " ";
        } else {
            cout << "-1 ";
        }
    }
}