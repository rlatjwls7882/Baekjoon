#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        vector<string> v;
        for(int i=0;i<n;i++) {
            string s; cin >> s;
            v.push_back(s);
        }
        sort(v.begin(), v.end());

        set<string> strings;
        bool chk=true;
        for(int i=0;i<n;i++) {
            if(!(i==0 || v[i].length()==v[i-1].length()) && chk) {
                for(int j=0;j<v[i].length();j++) {
                    if(strings.count(v[i].substr(0, j+1))) {
                        chk=false;
                        break;
                    }
                }
            }
            strings.insert(v[i]);
        }
        if(chk) cout << "YES\n";
        else cout << "NO\n";
    }
}