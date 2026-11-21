#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cout << "swimming ";
    cout << '\n' << flush;

    for(int i=0;i<n;i++) {
        string s; cin >> s;
        if(s[0]=='b') cout << "soccer ";
        else cout << "bowling ";
    }
    cout << '\n' << flush;
}