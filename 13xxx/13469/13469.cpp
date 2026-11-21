#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int q; cin >> q;
    if(q==1) {
        cout << "no";
        return 0;
    }

    for(int i=2;i*i<=q;i++) {
        if(q%i==0) {
            while(q%i==0) q/=i;
            if(q==1) cout << "yes";
            else cout << "no";
            return 0;
        }
    }
    cout << "yes";
}