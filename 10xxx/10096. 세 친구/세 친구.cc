#include<bits/stdc++.h>
using namespace std;

int n; string s;

bool match(int l1, int r1, int l2, int r2) {
    while(l1<=r1 && l2<=r2) {
        if(s[l1]==s[l2]) l1++;
        l2++;
    }
    return l1>r1;
}

bool isSame(int l1, int r1, int l2, int r2) {
    while(l1<=r1) {
        if(s[l1++]!=s[l2++]) return false;
    }
    return true;
}

void solve() {
    if(n%2==0) {
        cout << "NOT POSSIBLE";
        return;
    }

    bool chk1 = match(0, n/2-1, n/2, n-1);
    bool chk2 = match(n/2+1, n-1, 0, n/2);

    if(chk1 && chk2) {
        if(isSame(0, n/2-1, n/2+1, n-1)) {
            for(int i=0;i<n/2;i++) cout << s[i];
        } else {
            cout << "NOT UNIQUE";
        }
    } else if(chk1) {
        for(int i=0;i<n/2;i++) cout << s[i];
    } else if(chk2) {
        for(int i=n/2+1;i<n;i++) cout << s[i];
    } else {
        cout << "NOT POSSIBLE";
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> s;
    solve();
}