#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    string dict[n];
    for(int i=0;i<n;i++) cin >> dict[i];
    sort(dict, dict+n, greater<string>());

    int m; cin >> m;
    while(m-->0) {
        string s; cin >> s;
        int cnt=0, idx=0;
        while(idx<s.length()) {
            bool chk=false;
            for(int i=0;i<n;i++) {
                if(idx+dict[i].length()<=s.length() && s.substr(idx, dict[i].length()).compare(dict[i])==0) {
                    idx += dict[i].length();
                    chk=true;
                    break;
                }
            }
            if(cnt>2 || !chk) break;
            cnt++;
        }

        if(idx==s.length() && cnt<=2) cout << cnt << '\n';
        else cout << "0\n";
    }
}