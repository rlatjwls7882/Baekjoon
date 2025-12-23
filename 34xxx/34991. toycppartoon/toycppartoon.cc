#include<bits/stdc++.h>
using namespace std;

string toy = "toycartoon";

int find(string s) {
    for(int i=0;i+s.length()<=toy.length();i++) {
        if(s==toy.substr(i, s.length())) return i;
    }
    return -1;
}

string solve(string s) {
    for(int i=s.length();i>=1;i--) {
        int idx = find(s.substr(0, i));
        if(idx!=-1) {
            string ret=toy.substr(0, idx);
            ret+=s;

            int cnt=0;
            idx+=i;
            for(int j=s.length()-i;j>=1;j--) {
                if(s.substr(s.length()-j)==toy.substr(idx, j)) {
                    idx+=j;
                    break;
                }
            }
            ret+=toy.substr(idx+cnt);
            return ret;
        }
    }
    return toy+"_"+s;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    string s; cin >> s;
    string res = solve(s);
    if(res.length()>20) cout << toy;
    else cout << res;
}