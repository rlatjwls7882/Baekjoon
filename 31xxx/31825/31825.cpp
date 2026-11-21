#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, q; cin >> n >> q;
    string s; cin >> s;

    while(q--) {
        int x, l, r; cin >> x >> l >> r;
        if(x==1) {
            int cnt=0;
            for(int i=l-1;i<r;i++) {
                if(cnt==0 || s[i]!=s[i-1]) cnt++;
            }
            cout << cnt << '\n';
        } else {
            for(int i=l-1;i<r;i++) {
                s[i] = (s[i]-'A'+1)%26+'A';
            }
        }
    }
}