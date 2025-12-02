#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;

    int ret=1, jumpX=1, jumpO=0;
    for(int i=1;i<n;i++) {
        int l; cin >> l;
        if(l<=k) {
            jumpX++;
            jumpO++;
        } else {
            jumpO=jumpX+1;
            jumpX=1;
        }
        ret = max({ret, jumpX, jumpO});
    }
    cout << ret;
}