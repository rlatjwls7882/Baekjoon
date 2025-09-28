#include<bits/stdc++.h>
using namespace std;

string s;

void solve() {
    for(int i=s.length()-1;i>0;i--) {
        if(s[i-1]<s[i]) {
            int j=i;
            for(int k=j+1;k<s.length();k++) {
                if(s[i-1]<s[k] && s[k]<s[j]) j=k;
            }
            swap(s[i-1], s[j]);
            sort(s.begin()+i, s.end());
            cout << s << '\n';
            return;
        }
    }
    cout << "BIGGEST\n";
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        cin >> s;
        solve();
    }
}