#include<bits/stdc++.h>
using namespace std;

int rem[128];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; string s; cin >> n >> m >> s;
    string s2 = s;
    sort(s2.begin(), s2.end());
    for(int i=0;i<m;i++) rem[s2[i]]++;
    
    for(int i=0;i<n;i++) {
        if(rem[s[i]]) rem[s[i]]--;
        else cout << s[i];
    }
}