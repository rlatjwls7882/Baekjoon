#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;

    int cntO=0, cntH=0;
    for(int i=0;i<n;i++) {
        if(s[i]=='O') cntO++;
        else cntH++;
    }
    if(cntO*2!=cntH) {
        cout << "mix";
        return 0;
    }

    int l=0, r=n-1;
    for(int i=0;i<n;i++) {
        if(s[i]=='O') {
            while(l<i && s[l]!='H') l++;
            if(l>=i) {
                cout << "mix";
                return 0;
            }
            l++;
        }
    }
    for(int i=n-1;i>=0;i--) {
        if(s[i]=='O') {
            while(r>i && s[r]!='H') r--;
            if(r<=i) {
                cout << "mix";
                return 0;
            }
            r--;
        }
    }
    cout << "pure";
}