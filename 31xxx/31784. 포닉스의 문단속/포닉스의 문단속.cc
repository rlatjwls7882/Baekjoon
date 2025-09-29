#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; string s; cin >> n >> k >> s;

    for(int i=0;i<n;i++) {
        if(i==n-1) {
            cout << (char)((s[i]-'A'+k)%26+'A');
        } else if(s[i]!='A' && k>=26-(s[i]-'A')) {
            cout << 'A';
            k -= 26-(s[i]-'A');
        } else {
            cout << s[i];
        }
    }
}