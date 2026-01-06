#include<bits/stdc++.h>
using namespace std;

int n, l[1000];

bool chk(int sz) {
    for(int i=0;i<sz;i++) {
        if(l[i]!=l[n-sz+i]) return false;
    }
    return true;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> l[i];
    for(int i=1;i<=n/2;i++) {
        if(chk(i)) {
            cout << "yes";
            return 0;
        }
    }
    cout << "no";
}