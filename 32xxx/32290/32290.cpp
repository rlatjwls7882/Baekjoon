#include<bits/stdc++.h>
using namespace std;

bool exist[1002];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int l, r, x; cin >> l >> r >> x;
    for(int i=l;i<=r;i++) exist[i|x]=true;

    for(int i=0;i<=1001;i++) {
        if(!exist[i]) {
            cout << i;
            return 0;
        }
    }
}