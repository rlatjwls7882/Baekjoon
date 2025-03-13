#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s, t; cin >> s >> t;
    vector<int> v(t.length());
    for(int i=0;i<s.length();i++) {
        for(int j=0;j<t.length();j++) {
            if(s[i]==t[j] && (j==0 || v[j]<v[j-1])) {
                v[j]++;
                break;
            }
        }
    }
    cout << v[t.length()-1];
}